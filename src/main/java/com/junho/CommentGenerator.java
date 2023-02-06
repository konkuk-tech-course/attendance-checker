package com.junho;

import com.junho.constant.PrivateInfo;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.List;

public class CommentGenerator {

    public static final String COMMENT_MESSAGE = "test";

    private void createComment() throws IOException {
        GHRepository repository = getRepositoryFromGitHub();
        List<GHIssue> opendIssue = repository.getIssues(GHIssueState.OPEN);

        if (checkIfMoreThanOneIssuesExist(opendIssue)){
            throw new IllegalArgumentException("하나 이상의 opened된 issue가 있습니다");
        }
        opendIssue.get(0).comment(COMMENT_MESSAGE);
    }

    private GHRepository getRepositoryFromGitHub() throws IOException {
        GitHub gitHub = GitHub.connect(PrivateInfo.ID, PrivateInfo.TOKEN);
        return gitHub.getRepository("konkuk-tech-course/attendance-checker");
    }

    private boolean checkIfMoreThanOneIssuesExist(List<GHIssue> openedIssue) {
        return openedIssue.size() != 1;
    }

    public static void main(String[] args) throws IOException {
        CommentGenerator commentGenerator = new CommentGenerator();
        commentGenerator.createComment();
    }
}
