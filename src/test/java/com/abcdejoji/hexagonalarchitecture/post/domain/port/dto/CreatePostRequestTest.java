package com.abcdejoji.hexagonalarchitecture.post.domain.port.dto;

import com.abcdejoji.hexagonalarchitecture.post.domain.model.*;
import com.abcdejoji.hexagonalarchitecture.post.domain.model.vo.*;
import com.abcdejoji.hexagonalarchitecture.post.domain.port.in.dto.*;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;


class CreatePostRequestTest {

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