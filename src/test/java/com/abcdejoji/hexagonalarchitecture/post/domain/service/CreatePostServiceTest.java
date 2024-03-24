package com.abcdejoji.hexagonalarchitecture.post.domain.service;

import com.abcdejoji.hexagonalarchitecture.post.domain.model.vo.*;
import com.abcdejoji.hexagonalarchitecture.post.domain.port.in.dto.*;
import com.abcdejoji.hexagonalarchitecture.post.domain.port.out.*;
import org.junit.jupiter.api.*;

import static org.mockito.Mockito.*;

class CreatePostServiceTest {

    private final SavePostPort savePostPort = mock(SavePostPort.class);
    private final CreatePostService createPostService = new CreatePostService(savePostPort);

    @Test
    @DisplayName("게시글을 생성한다")
    void createPost() throws Exception {

        // given
        CreatePostRequest request = new CreatePostRequest(
                new PostTitle("제목"),
                new PostContent("내용")
        );

        // when
        createPostService.createPost(request);

        // then
        verify(savePostPort, times(1)).savePost(request.toEntity());
    }
}