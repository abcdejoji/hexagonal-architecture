package com.abcdejoji.hexagonalarchitecture.post.application.domain.vo;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;


class PostContentTest {

    @Test
    @DisplayName("내용에 null이 들어오면 IllegalArgumentException이 발생한다")
    void contentNotNull() throws Exception {

        assertThatThrownBy(() -> new PostContent(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("내용은 빈 값일 수 없습니다.");
    }

    @Test
    @DisplayName("내용에 빈 값이 들어오면 IllegalArgumentException이 발생한다")
    void contentNotEmpty() throws Exception {

        assertThatThrownBy(() -> new PostContent(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("내용은 빈 값일 수 없습니다.");
    }

    @Test
    @DisplayName("내용에 널 스트링이 들어오면 IllegalArgumentException이 발생한다")
    void contentNotNullString() throws Exception {

        assertThatThrownBy(() -> new PostContent(" "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("내용은 빈 값일 수 없습니다.");
    }

    @Test
    @DisplayName("내용이 500자가 넘으면 IllegalArgumentException이 발생한다")
    void contentLength() throws Exception {

        assertThat(new PostContent("1".repeat(500))).isNotNull();

        assertThatThrownBy(() -> new PostContent("1".repeat(501)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("내용은 500자를 초과할 수 없습니다.");
    }
}
