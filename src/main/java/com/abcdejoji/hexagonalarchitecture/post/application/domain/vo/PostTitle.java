package com.abcdejoji.hexagonalarchitecture.post.application.domain.vo;

import org.springframework.util.*;

public class PostTitle {

    private final String value;

    public PostTitle(String value) {

        assert StringUtils.hasText(value): "제목은 빈 값일 수 없습니다.";
        assert value.length() <= 10 : "제목은 10자를 넘을 수 없습니다.";

        this.value = value;
    }
}
