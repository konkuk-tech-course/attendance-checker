package com.junho.IssueGenerator.domain;

public enum Label {
    DOCUMENTATION("documentation");

    private final String value;

    Label(final String documentation) {
        this.value = documentation;
    }

    public String getValue() {
        return value;
    }
}
