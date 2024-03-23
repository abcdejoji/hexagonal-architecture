package com.abcdejoji.hexagonalarchitecture.post.application.domain;

import com.abcdejoji.hexagonalarchitecture.post.application.domain.vo.*;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class PostTest {

    @Test
    @DisplayName("제목에 null이 들어오면 NullPointerException이 발생한다.")
    void titleIsRequired() throws Exception {

        assertThatThrownBy(() -> new Post(null, null, null))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("제목은 필수 값 입니다.");
    }

    @Test
    @DisplayName("내용에 null이 들어오면 NullPointerException이 발생한다.")
    void contentIsRequired() throws Exception {

        // given
        PostTitle postTitle = new PostTitle("제목");

        assertThatThrownBy(() -> new Post(null, postTitle, null))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("내용은 필수 값 입니다.");
    }
}