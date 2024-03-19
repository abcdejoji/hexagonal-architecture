package com.abcdejoji.hexagonalarchitecture.post.application.domain.vo;

import com.abcdejoji.hexagonalarchitecture.post.application.domain.vo.*;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;


class PostTitleTest {

    @Test
    @DisplayName("제목에 빈 값이 들어오면 AssertionError가 발생한다")
    void titleNotEmpty() throws Exception {

        assertThatThrownBy(() -> new PostTitle(null))
                .isInstanceOf(AssertionError.class)
                .hasMessage("제목은 빈 값일 수 없습니다.");

        assertThatThrownBy(() -> new PostTitle(""))
                .isInstanceOf(AssertionError.class)
                .hasMessage("제목은 빈 값일 수 없습니다.");

        assertThatThrownBy(() -> new PostTitle("   "))
                .isInstanceOf(AssertionError.class)
                .hasMessage("제목은 빈 값일 수 없습니다.");
    }
}