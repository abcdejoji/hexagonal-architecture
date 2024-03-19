package com.abcdejoji.hexagonalarchitecture.post.application.domain.vo;

import org.springframework.util.*;

public class PostContent {

    private final String value;

    public PostContent(String value) {

        assert StringUtils.hasText(value): "내용은 빈 값일 수 없습니다.";
        assert value.length() <= 500 : "내용은 500자를 넘을 수 없습니다.";

        this.value = value;
    }
}
