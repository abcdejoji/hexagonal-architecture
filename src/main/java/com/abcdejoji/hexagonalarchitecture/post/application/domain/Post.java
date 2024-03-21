package com.abcdejoji.hexagonalarchitecture.post.application.domain;

import com.abcdejoji.hexagonalarchitecture.config.jacoco.*;
import com.abcdejoji.hexagonalarchitecture.post.application.domain.id.*;
import com.abcdejoji.hexagonalarchitecture.post.application.domain.vo.*;

import java.util.*;

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

    public Post(PostTitle postTitle, PostContent postContent) {
        this(null, postTitle, postContent);
    }

    @ExcludeTestGenerated
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(postId, post.postId) && Objects.equals(postTitle, post.postTitle) && Objects.equals(postContent, post.postContent);
    }

    @ExcludeTestGenerated
    @Override
    public int hashCode() {
        return Objects.hash(postId, postTitle, postContent);
    }
}
