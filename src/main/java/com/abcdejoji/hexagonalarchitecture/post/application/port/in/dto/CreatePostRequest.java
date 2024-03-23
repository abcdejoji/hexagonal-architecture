package com.abcdejoji.hexagonalarchitecture.post.application.port.in.dto;

import com.abcdejoji.hexagonalarchitecture.post.application.domain.*;
import com.abcdejoji.hexagonalarchitecture.post.application.domain.vo.*;

public record CreatePostRequest(
        PostTitle postTitle,
        PostContent postContent
) {

    public Post toEntity() {
        return new Post(this.postTitle, this.postContent);
    }

}
