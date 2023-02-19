package com.junho.IssueGenerator.domain.title;

import java.time.LocalDateTime;

public class DateTimeTitle extends Title {
    private final LocalDateTime localDateTime;
    private final DateTimeFormat dateTimeFormat;

    public DateTimeTitle(LocalDateTime localDateTime, DateTimeFormat dateTimeFormatter) {
        this.localDateTime = localDateTime;
        dateTimeFormat = dateTimeFormatter;
    }

    @Override
    public String generateTitle() {
        return dateTimeFormat.formatting(localDateTime)
                .concat(titleTail);
    }
}
