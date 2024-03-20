package com.abcdejoji.hexagonalarchitecture.post.application.domain.id;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PostIdTest {

    @Test
    @DisplayName("equals and hashCode")
    void equalsAndHashCode() throws Exception {

        // given
        UUID uuid = UUID.randomUUID();

        PostId postId1 = new PostId(uuid);
        PostId postId2 = new PostId(uuid);
        PostId postId3 = new PostId(UUID.randomUUID());

        // when & then
        assertThat(postId1.equals(postId1)).isTrue();
        assertThat(postId1.equals(postId2)).isTrue();
        assertThat(postId1.equals(postId3)).isFalse();
        assertThat(postId1.equals(null)).isFalse();
        assertThat(postId1.equals("")).isFalse();

        assertThat(postId1.hashCode()).isEqualTo(postId2.hashCode());
    }

}