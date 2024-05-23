package it.partec.tassidicambio.util;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DateUtil {

    public static String getYesterday() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return yesterday.format(formatter);
    }

    public static LocalDate getDateYesterday() {
        return LocalDate.now().minusDays(1);
    }

    public static String convertiData(String dataStringa) {
        DateTimeFormatter formatoInput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataStringa, formatoInput);
        DateTimeFormatter formatoOutput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return data.format(formatoOutput);
    }

    public static String convertiStringDate(LocalDate date) {
        DateTimeFormatter formatoInput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return date.format(formatoInput);
    }

    public static LocalDate convertiLocalDate(String dataStringa) {
        DateTimeFormatter formatoInput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(dataStringa, formatoInput);
    }

    public static String addDay(String date) {
        LocalDate data = convertiLocalDate(date);
        data = data.plusDays(1);
        return convertiStringDate(data);
    }

    public static boolean compareDate(String dataStorico, LocalDate dateYesterday) {
        LocalDate data = convertiLocalDate(dataStorico);
        return data.isBefore(dateYesterday);
    }
}
