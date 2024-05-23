package it.bi_rest.bi_rest.util;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

public class DateToOffsetDateTimeConverter
  implements Converter<Date, OffsetDateTime> {

  @Override
  public OffsetDateTime convert(Date date) {
    Instant instant = date.toInstant();
    return instant.atZone(ZoneId.systemDefault()).toOffsetDateTime();
  }
}
