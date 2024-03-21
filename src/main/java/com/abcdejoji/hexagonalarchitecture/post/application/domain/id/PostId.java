package com.abcdejoji.hexagonalarchitecture.post.application.domain.id;

import com.abcdejoji.hexagonalarchitecture.config.jacoco.*;

import java.util.*;

public class PostId {

    private UUID value;

    @ExcludeTestGenerated
    public PostId(UUID value) {
        this.value = value;
    }

    @ExcludeTestGenerated
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostId postId = (PostId) o;
        return Objects.equals(value, postId.value);
    }

    @ExcludeTestGenerated
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
