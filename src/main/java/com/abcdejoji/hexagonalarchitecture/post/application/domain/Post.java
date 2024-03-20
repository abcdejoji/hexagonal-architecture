package com.abcdejoji.hexagonalarchitecture.post.application.domain;

import com.abcdejoji.hexagonalarchitecture.post.application.domain.id.*;
import com.abcdejoji.hexagonalarchitecture.post.application.domain.vo.*;

public class Post {

    private final PostId postId;
    private final PostTitle postTitle;
    private final PostContent postContent;

    public Post(PostId postId, PostTitle postTitle, PostContent postContent) {

        assert postTitle != null : "제목은 필수 값 입니다.";
        assert postContent != null : "내용은 필수 값 입니다.";

        this.postId = postId;
        this.postTitle = postTitle;
        this.postContent = postContent;
    }
}
