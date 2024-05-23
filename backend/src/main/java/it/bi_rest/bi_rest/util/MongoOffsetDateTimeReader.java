package it.bi_rest.bi_rest.util;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import org.bson.Document;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class MongoOffsetDateTimeReader implements Converter<Document, Date> {

  public static final String DATE_FIELD = "dateTime";
  public static final String OFFSET_FIELD = "offset";

  @Override
  public Date convert(Document document) {
    Date dateTime = document.getDate(DATE_FIELD);
    ZoneOffset offset = ZoneOffset.of(document.getString(OFFSET_FIELD));
    return Date.from(
      OffsetDateTime.ofInstant(dateTime.toInstant(), offset).toInstant()
    );
  }
}
