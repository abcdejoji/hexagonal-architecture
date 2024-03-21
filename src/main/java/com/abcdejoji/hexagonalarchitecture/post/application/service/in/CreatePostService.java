package com.abcdejoji.hexagonalarchitecture.post.application.service.in;

import com.abcdejoji.hexagonalarchitecture.config.jacoco.*;
import com.abcdejoji.hexagonalarchitecture.post.application.port.in.*;
import com.abcdejoji.hexagonalarchitecture.post.application.port.in.dto.*;
import com.abcdejoji.hexagonalarchitecture.post.application.port.out.*;

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
