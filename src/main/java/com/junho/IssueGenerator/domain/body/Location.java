package com.junho.IssueGenerator.domain.body;

public enum Location {
    GUNJA_STARBUCKS("군자역 스타벅스");

    private final String value;

    Location(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
