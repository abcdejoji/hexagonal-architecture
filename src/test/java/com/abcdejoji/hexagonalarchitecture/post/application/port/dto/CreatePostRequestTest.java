package com.abcdejoji.hexagonalarchitecture.post.application.port.dto;

import com.abcdejoji.hexagonalarchitecture.post.application.domain.*;
import com.abcdejoji.hexagonalarchitecture.post.application.domain.vo.*;
import com.abcdejoji.hexagonalarchitecture.post.application.port.in.dto.*;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;


class CreatePostRequestTest {

    @Test
    @DisplayName("생성")
    void constructor() throws Exception {

        // given
        PostTitle postTitle = new PostTitle("a");
        PostContent postContent = new PostContent("b");

        // when
        CreatePostRequest request = new CreatePostRequest(postTitle, postContent);

        // then
        assertThat(request).isNotNull();
    }

    @Test
    @DisplayName("Post Entity를 생성한다.")
    void toEntity() throws Exception {

        // given
        CreatePostRequest request = new CreatePostRequest(
                new PostTitle("제목"),
                new PostContent("내용")
        );

        // when
        Post post = request.toEntity();

        // then
        assertThat(post).isNotNull();
    }
}