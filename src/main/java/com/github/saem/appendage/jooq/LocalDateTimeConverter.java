package com.github.saem.appendage.jooq;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import org.jooq.Converter;

public class LocalDateTimeConverter implements Converter<Timestamp, LocalDateTime> {
    @Override
    public LocalDateTime from(Timestamp databaseObject) {
        return databaseObject.toLocalDateTime();
    }

    @Override
    public Timestamp to(LocalDateTime dt) {
        return Timestamp.valueOf(dt);
    }

    @Override
    public Class<Timestamp> fromType() {
        return Timestamp.class;
    }

    @Override
    public Class<LocalDateTime> toType() {
        return LocalDateTime.class;
    }
}
