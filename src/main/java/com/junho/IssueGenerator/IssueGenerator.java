package com.junho.IssueGenerator;

import com.junho.IssueGenerator.domain.Issue;
import com.junho.IssueGenerator.domain.Label;
import com.junho.IssueGenerator.domain.body.Body;
import com.junho.IssueGenerator.domain.body.Location;
import com.junho.IssueGenerator.domain.body.Notice;
import java.io.IOException;
import java.time.LocalDateTime;
import org.kohsuke.github.GHRepository;

public class IssueGenerator {
    public static void createIssue(final GHRepository repository, final Issue issue) {
        try {
            issue.upload(repository);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        GHRepository repository = RepositoryEnum.ATTENDANCE_CHECKER.getRepository();

        Issue dateTimeIssue = Issue.createDateTimeIssue(
                LocalDateTime.now(),
                new Body(Location.GUNJA_STARBUCKS, Notice.BASIC),
                Label.DOCUMENTATION
        );

        IssueGenerator.createIssue(repository, dateTimeIssue);
    }
}
