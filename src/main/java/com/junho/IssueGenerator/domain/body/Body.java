package com.junho.IssueGenerator.domain.body;

public class Body {
    private final Location location;
    private final Notice notice;

    public Body(final Location location, final Notice notice) {
        this.location = location;
        this.notice = notice;
    }

    public String generateBody() {
        return location.getValue()
                .concat(" ")
                .concat(notice.getValue());
    }
}
