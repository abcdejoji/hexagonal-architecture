package com.abcdejoji.hexagonalarchitecture.post.application.domain.id;

import java.util.*;

public class PostId {

    private UUID value;

    public PostId(UUID value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostId postId = (PostId) o;
        return Objects.equals(value, postId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
