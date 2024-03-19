package com.abcdejoji.hexagonalarchitecture.post.application.port.dto;

import com.abcdejoji.hexagonalarchitecture.post.application.domain.vo.*;

public class PostCreateRequest {

    private final PostTitle postTitle;
    private final PostContent postContent;

    public PostCreateRequest(PostTitle postTitle, PostContent postContent) {
        this.postTitle = postTitle;
        this.postContent = postContent;
    }
}
