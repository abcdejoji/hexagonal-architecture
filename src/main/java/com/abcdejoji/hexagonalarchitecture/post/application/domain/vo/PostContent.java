package com.abcdejoji.hexagonalarchitecture.post.application.domain.vo;

import org.springframework.util.*;

public class PostContent {

    private final String value;

    public PostContent(String value) {

        if (!StringUtils.hasText(value)) {
            throw new IllegalArgumentException("내용은 빈 값일 수 없습니다.");
        }

        if (value.length() > 500) {
            throw new IllegalArgumentException("내용은 500자를 초과할 수 없습니다.");
        }

        this.value = value;
    }
}
