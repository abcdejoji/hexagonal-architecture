package com.abcdejoji.hexagonalarchitecture.post.domain.port.in;

import com.abcdejoji.hexagonalarchitecture.post.domain.port.in.dto.*;

public interface CreatePostUseCase {

    void createPost(CreatePostRequest request);
}
