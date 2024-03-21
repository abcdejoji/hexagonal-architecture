package com.abcdejoji.hexagonalarchitecture.post.application.port.in.dto;

import com.abcdejoji.hexagonalarchitecture.config.jacoco.*;
import com.abcdejoji.hexagonalarchitecture.post.application.domain.*;
import com.abcdejoji.hexagonalarchitecture.post.application.domain.vo.*;

public class CreatePostRequest {

    private final PostTitle postTitle;
    private final PostContent postContent;

    @ExcludeTestGenerated
    public CreatePostRequest(PostTitle postTitle, PostContent postContent) {
        this.postTitle = postTitle;
        this.postContent = postContent;
    }

    public Post toEntity() {
        return new Post(this.postTitle, this.postContent);
    }
}
