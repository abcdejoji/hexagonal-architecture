package com.abcdejoji.hexagonalarchitecture.post.domain.model;

import com.abcdejoji.hexagonalarchitecture.config.jacoco.*;
import com.abcdejoji.hexagonalarchitecture.post.domain.model.id.*;
import com.abcdejoji.hexagonalarchitecture.post.domain.model.vo.*;

import java.util.*;

import static java.util.Objects.*;

public class Post {

    private final PostId postId;
    private final PostTitle postTitle;
    private final PostContent postContent;

    public Post(PostId postId, PostTitle postTitle, PostContent postContent) {

        requireNonNull(postTitle, "제목은 필수 값 입니다.");
        requireNonNull(postContent, "내용은 필수 값 입니다.");

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
        return hash(postId, postTitle, postContent);
    }
}
