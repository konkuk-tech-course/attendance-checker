package com.junho.IssueGenerator.domain.body;

public enum Notice {
    BASIC("출석 확인을 위해 comment를 달아주세요😊");

    private final String value;

    Notice(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
