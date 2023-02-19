package com.junho.IssueGenerator.domain.title;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public enum DateTimeFormat {
    BASIC(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));

    private final DateTimeFormatter dateTimeFormatter;

    DateTimeFormat(final DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }

    public String formatting(LocalDateTime localDateTime) {
        return localDateTime.format(dateTimeFormatter);
    }
}
