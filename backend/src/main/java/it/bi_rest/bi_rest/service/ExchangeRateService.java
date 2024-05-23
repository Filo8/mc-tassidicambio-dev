package it.bi_rest.bi_rest.service;

import it.bi_rest.bi_rest.domain.ExchangeRate;
import it.bi_rest.bi_rest.model.ExchangeRateDTO;
import it.bi_rest.bi_rest.repos.ExchangeRateRepository;
import it.bi_rest.bi_rest.request.ExchangeAmountRequest;
import it.bi_rest.bi_rest.request.ExchangeRateResponse;
import it.bi_rest.bi_rest.request.ExchangeRateStatistics;
import it.bi_rest.bi_rest.request.ExchangeRatesRequestStori;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExchangeRateService {

  private final ExchangeRateRepository exchangeRateRepository;

  public ExchangeRateService(
    final ExchangeRateRepository exchangeRateRepository
  ) {
    this.exchangeRateRepository = exchangeRateRepository;
  }

  ////////////////////////////////////////////////////////////////////
  public List<ExchangeRateDTO> findReferenceCurrency() {
    Set<ExchangeRate> exchangeRatesSet = new TreeSet<>(
      Comparator.comparing(ExchangeRate::getReferenceCurrency)
    );
    exchangeRatesSet.addAll(exchangeRateRepository.findAll());

    return exchangeRatesSet
      .stream()
      .map(exchangeRate -> mapToDTO(exchangeRate, new ExchangeRateDTO()))
      .collect(Collectors.toList());
  }

  //////////////////////////////////////////////////////////////////////
  public List<ExchangeRateDTO> findAll() {
    final List<ExchangeRate> exchangeRates = exchangeRateRepository.findAll(
      Sort.by("country")
    );

    return exchangeRates
      .stream()
      .map(exchangeRate -> mapToDTO(exchangeRate, new ExchangeRateDTO()))
      .toList();
  }

  ///////////////////////////////////////////////////////////////////////////
  public List<ExchangeRateDTO> getExchangeRateByIso(
    String referenceCurrency,
    Date referenceDate,
    List<String> isoCurrencies
  ) throws ParseException {
    List<ExchangeRate> exchangeRatesIso = exchangeRateRepository.findByReferenceCurrency(
      referenceCurrency
    );

    // Filtraggio e registrazione basati su stream per prestazioni ottimizzate

    List<ExchangeRate> filteredExchangeRates = exchangeRatesIso
      .stream()
      .filter(rate -> isoCurrencies.contains(rate.getIsoCode()))
      .filter(rate ->
        formatOffsetDateTime(rate.getReferenceDate())
          .equals(formatOffsetDateTime(referenceDate))
      )
      .collect(Collectors.toList());

    return filteredExchangeRates
      .stream()
      .map(this::mapToDTO)
      .collect(Collectors.toList());
  }

  ////////////////////////////////////////////////////////////////////////////

  public List<ExchangeRateDTO> getExchangeRatesByReferenceDateAndIsoCode(
    String ReferenceCurrency,
    Date referenceDate
  ) {
    log.info(
      "ReferenceCurrency: {}, referenceDate: {}",
      ReferenceCurrency,
      referenceDate
    );

    List<ExchangeRate> exchangeRatesIso = exchangeRateRepository.findByReferenceCurrency(
      ReferenceCurrency
    );

    // Filtraggio e registrazione basati su stream per prestazioni ottimizzate
    List<ExchangeRate> filteredExchangeRates = exchangeRatesIso
      .stream()
      .filter(rate ->
        formatOffsetDateTime(rate.getReferenceDate())
          .equals(formatOffsetDateTime(referenceDate))
      )
      .collect(Collectors.toList());

    return filteredExchangeRates
      .stream()
      .map(this::mapToDTO)
      .collect(Collectors.toList());
  }

  ///////////////////////////////////////////////////////////////////////////
  public List<ExchangeRateResponse> getHistoryExchangeRates(
    ExchangeRatesRequestStori request
  ) {
    List<ExchangeRate> exchangeRatesIso = exchangeRateRepository
      .findByReferenceCurrency(request.getReferenceCurrency())
      .stream()
      .filter(rate -> request.getIsoCurrencies().contains(rate.getIsoCode()))
      .filter(rate ->
        formatOffsetDateTimeLocal(rate.getReferenceDate())
          .isAfter(formatOffsetDateTimeLocal(request.getFrom()))
      )
      .collect(Collectors.toList());

    DoubleSummaryStatistics stats = exchangeRatesIso
      .stream()
      .mapToDouble(rate -> Double.parseDouble(rate.getAvgRate()))
      .summaryStatistics();

    ExchangeRateStatistics exchangeRateStats = new ExchangeRateStatistics();
    exchangeRateStats.setMedia(stats.getAverage());
    exchangeRateStats.setMassimo(stats.getMax());
    exchangeRateStats.setMinimo(stats.getMin());
    exchangeRateStats.setFromDate(request.from);
    exchangeRateStats.setToDate(request.to);

    ExchangeRateResponse response = new ExchangeRateResponse();
    response.setExchangeRates(
      exchangeRatesIso.stream().map(this::mapToDTO).collect(Collectors.toList())
    );
    response.setStats(exchangeRateStats);

    List<ExchangeRateResponse> responses = new ArrayList<>();
    responses.add(response);
    return responses;
  }

  /////////////////////////////////////////////////////////////////////////////
  public double calculateExchangeAmount(ExchangeAmountRequest request) {
    double paidAmount = request.getPaidAmount();
    double sentFeesPercent = request.getSentFeesPercent();
    double exchangeRateApplied = request.getExchangeRateApplied();
    double receivedFeesPercent = request.getReceivedFeesPercent();
    log.info(
      "Calculating exchange amount",
      request.exchangeRateApplied,
      request.paidAmount,
      request.sentFeesPercent,
      request.receivedFeesPercent
    );
    return (
      paidAmount *
      (1 - sentFeesPercent) *
      exchangeRateApplied *
      (1 - receivedFeesPercent)
    );
  }

  ///////////////////////////////////////////////////////////////////////////
  private ExchangeRateDTO mapToDTO(ExchangeRate exchangeRate) {
    ExchangeRateDTO dto = new ExchangeRateDTO();
    dto.setCountry(exchangeRate.getCountry());
    dto.setCurrency(exchangeRate.getCurrency());
    dto.setIsoCode(exchangeRate.getIsoCode());
    dto.setUicCode(exchangeRate.getUicCode());
    dto.setAvgRate(exchangeRate.getAvgRate());
    dto.setReferenceCurrency(exchangeRate.getReferenceCurrency());
    dto.setExchangeConvention(exchangeRate.getExchangeConvention());
    dto.setReferenceDate(exchangeRate.getReferenceDate());
    dto.setTmsInsert(exchangeRate.getTmsInsert());
    return dto;
  }

  private ExchangeRateDTO mapToDTO(
    final ExchangeRate exchangeRate,
    final ExchangeRateDTO exchangeRateDTO
  ) {
    exchangeRateDTO.setCountry(exchangeRate.getCountry());
    exchangeRateDTO.setCurrency(exchangeRate.getCurrency());
    exchangeRateDTO.setIsoCode(exchangeRate.getIsoCode());
    exchangeRateDTO.setUicCode(exchangeRate.getUicCode());
    exchangeRateDTO.setAvgRate(exchangeRate.getAvgRate());
    exchangeRateDTO.setExchangeConvention(exchangeRate.getExchangeConvention());
    exchangeRateDTO.setReferenceDate(exchangeRate.getReferenceDate());
    exchangeRateDTO.setReferenceCurrency(exchangeRate.getReferenceCurrency());
    exchangeRateDTO.setTmsInsert(exchangeRate.getTmsInsert());
    return exchangeRateDTO;
  }

  public String formatOffsetDateTime(Date offsetDateTime) {
    // Converti l'oggetto Date in OffsetDateTime
    OffsetDateTime dateTime = offsetDateTime
      .toInstant()
      .atOffset(ZoneOffset.UTC);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDateTime = dateTime.format(formatter);
    return formattedDateTime;
  }

  public String convertStringToDate(Date from) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    return dateFormat.format(from); // parse(from);
  }

  private LocalDate formatOffsetDateTimeLocal(Date offsetDateTime) {
    return offsetDateTime
      .toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
  }
}
