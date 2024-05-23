package it.partec.tassidicambio.service;

import it.partec.tassidicambio.dto.ExchangeRateResponse;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

public interface ExchangeRateService {

    void inserimentoStorico();

    void inserimentoGiornaliero();
}
