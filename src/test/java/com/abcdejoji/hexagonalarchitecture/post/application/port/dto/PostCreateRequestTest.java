package com.abcdejoji.hexagonalarchitecture.post.application.port.dto;

import com.abcdejoji.hexagonalarchitecture.post.application.domain.vo.*;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;


class PostCreateRequestTest {

    @Test
    @DisplayName("생성")
    void constructor() throws Exception {

        // given
        var postTitle = new PostTitle("a");
        var postContent = new PostContent("b");

        // when
        var request = new PostCreateRequest(postTitle, postContent);

        // then
        assertThat(request).isNotNull();
    }
}