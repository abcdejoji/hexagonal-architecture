package com.abcdejoji.hexagonalarchitecture.post.domain.model.vo;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;


class PostTitleTest {

    @Test
    @DisplayName("제목에 null이 들어오면 AssertionError가 발생한다")
    void titleNotNull() throws Exception {

        assertThatThrownBy(() -> new PostTitle(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("제목은 빈 값일 수 없습니다.");
    }

    @Test
    @DisplayName("제목에 빈 값이 들어오면 AssertionError가 발생한다")
    void titleNotEmpty() throws Exception {

        assertThatThrownBy(() -> new PostTitle(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("제목은 빈 값일 수 없습니다.");
    }

    @Test
    @DisplayName("제목에 널 스트링이 들어오면 AssertionError가 발생한다")
    void titleNotNullString() throws Exception {

        assertThatThrownBy(() -> new PostTitle(" "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("제목은 빈 값일 수 없습니다.");
    }

    @Test
    @DisplayName("제목이 10자리가 넘으면 AssertionError가 발생한다")
    void titleLength() throws Exception {

        assertThat(new PostTitle("1".repeat(10))).isNotNull();

        assertThatThrownBy(() -> new PostTitle("1".repeat(11)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("제목은 10자를 초과할 수 없습니다.");
    }
}
