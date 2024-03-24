package com.abcdejoji.hexagonalarchitecture.post.domain.model.vo;

import org.springframework.util.*;

public class PostTitle {

    private final String value;

    public PostTitle(String value) {

        if (!StringUtils.hasText(value)) {
            throw new IllegalArgumentException("제목은 빈 값일 수 없습니다.");
        }

        if (value.length() > 10) {
            throw new IllegalArgumentException("제목은 10자를 초과할 수 없습니다.");
        }

        this.value = value;
    }
}
