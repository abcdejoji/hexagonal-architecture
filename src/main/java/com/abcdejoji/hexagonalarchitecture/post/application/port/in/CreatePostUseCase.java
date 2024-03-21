package com.abcdejoji.hexagonalarchitecture.post.application.port.in;

import com.abcdejoji.hexagonalarchitecture.post.application.port.in.dto.*;

public interface CreatePostUseCase {

    void createPost(PostCreateRequest request);
}
