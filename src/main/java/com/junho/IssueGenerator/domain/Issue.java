package com.junho.IssueGenerator.domain;

import com.junho.IssueGenerator.domain.body.Body;
import com.junho.IssueGenerator.domain.title.DateTimeFormat;
import com.junho.IssueGenerator.domain.title.DateTimeTitle;
import com.junho.IssueGenerator.domain.title.Title;
import java.io.IOException;
import java.time.LocalDateTime;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;

public class Issue {
    private final Title title;
    private final Body body;
    private final Label label;

    public Issue(final Title title, final Body body, final Label label) {
        this.title = title;
        this.body = body;
        this.label = label;
    }

    public static Issue createDateTimeIssue(final LocalDateTime localDateTime, final Body body, final Label label) {
        return new Issue(new DateTimeTitle(localDateTime, DateTimeFormat.BASIC), body, label);
    }

    public GHIssue upload(final GHRepository repository) throws IOException {
        return repository.createIssue(title.generateTitle())
                .body(body.generateBody())
                .label(label.getValue())
                .create();
    }
}
