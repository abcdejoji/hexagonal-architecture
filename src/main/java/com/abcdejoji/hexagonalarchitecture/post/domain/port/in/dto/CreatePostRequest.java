package com.abcdejoji.hexagonalarchitecture.post.domain.port.in.dto;

import com.abcdejoji.hexagonalarchitecture.post.domain.model.*;
import com.abcdejoji.hexagonalarchitecture.post.domain.model.vo.*;

public record CreatePostRequest(
        PostTitle postTitle,
        PostContent postContent
) {

    public Post toEntity() {
        return new Post(this.postTitle, this.postContent);
    }

}
