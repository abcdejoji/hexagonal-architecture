package com.abcdejoji.hexagonalarchitecture.post.domain.service;

import com.abcdejoji.hexagonalarchitecture.config.jacoco.*;
import com.abcdejoji.hexagonalarchitecture.post.domain.port.in.*;
import com.abcdejoji.hexagonalarchitecture.post.domain.port.in.dto.*;
import com.abcdejoji.hexagonalarchitecture.post.domain.port.out.*;

class CreatePostService implements CreatePostUseCase {

    private final SavePostPort savePostPort;

    @ExcludeTestGenerated
    public CreatePostService(SavePostPort savePostPort) {
        this.savePostPort = savePostPort;
    }

    @Override
    public void createPost(CreatePostRequest request) {
        savePostPort.savePost(request.toEntity());
    }
}
