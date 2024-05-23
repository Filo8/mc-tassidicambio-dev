package it.bi_rest.bi_rest.util;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import org.bson.Document;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class MongoOffsetDateTimeWriter implements Converter<Date, Document> {

  public static final String DATE_FIELD = "dateTime";
  public static final String OFFSET_FIELD = "offset";

  @Override
  public Document convert(Date offsetDateTime) {
    Document document = new Document();
    document.put(DATE_FIELD, offsetDateTime);
    document.put(
      OFFSET_FIELD,
      OffsetDateTime
        .ofInstant(offsetDateTime.toInstant(), ZoneOffset.UTC)
        .getOffset()
        .toString()
    );
    return document;
  }
}
