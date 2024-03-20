package com.abcdejoji.hexagonalarchitecture.post.application.domain;

import com.abcdejoji.hexagonalarchitecture.post.application.domain.id.*;
import com.abcdejoji.hexagonalarchitecture.post.application.domain.vo.*;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

class PostTest {

    @Test
    @DisplayName("PostId, PostTitle, PostContent를 할당하여 생성한다")
    void create() {

        // given
        PostId postId = new PostId(UUID.randomUUID());
        PostTitle postTitle = new PostTitle("제목");
        PostContent postContent = new PostContent("내용");

        // when
        Post post = new Post(postId, postTitle, postContent);

        // then
        assertThat(post).isNotNull();
    }

    @Test
    @DisplayName("PostId가 null이여도 생성된다.")
    void createPostIdIsNull() throws Exception {

        PostTitle postTitle = new PostTitle("제목");
        PostContent postContent = new PostContent("내용");

        // when
        Post post = new Post(null, postTitle, postContent);

        // then
        assertThat(post).isNotNull();
    }

    @Test
    @DisplayName("제목에 null이 들어오면 AssertError가 발생한다.")
    void titleIsRequired() throws Exception {

        assertThatThrownBy(() -> new Post(null, null, null))
                .isInstanceOf(AssertionError.class)
                .hasMessage("제목은 필수 값 입니다.");
    }

    @Test
    @DisplayName("내용에 null이 들어오면 AssertError가 발생한다.")
    void contentIsRequired() throws Exception {

        // given
        PostTitle postTitle = new PostTitle("제목");

        assertThatThrownBy(() -> new Post(null, postTitle, null))
                .isInstanceOf(AssertionError.class)
                .hasMessage("내용은 필수 값 입니다.");
    }
}