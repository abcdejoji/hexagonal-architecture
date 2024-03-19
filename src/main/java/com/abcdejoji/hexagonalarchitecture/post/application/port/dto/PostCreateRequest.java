package com.abcdejoji.hexagonalarchitecture.post.application.port.dto;

import com.abcdejoji.hexagonalarchitecture.post.application.domain.vo.*;

public class PostCreateRequest {

    private final PostTitle postTitle;

    public PostCreateRequest(PostTitle postTitle) {
        this.postTitle = postTitle;
    }
}
