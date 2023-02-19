package com.junho.IssueGenerator;

import com.junho.constant.PrivateInfo;
import java.io.IOException;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

public enum RepositoryEnum {
    ATTENDANCE_CHECKER("konkuk-tech-course/attendance-checker", PrivateInfo.ID, PrivateInfo.TOKEN);

    private final String name;
    private final String id;
    private final String token;

    RepositoryEnum(final String name, final String id, final String token) {
        this.name = name;
        this.id = id;
        this.token = token;
    }

    public GHRepository getRepository() throws IOException {
        return GitHub.connect(id, token).getRepository(name);
    }
}
