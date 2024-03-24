package com.abcdejoji.hexagonalarchitecture.post.domain.port.out;

import com.abcdejoji.hexagonalarchitecture.post.domain.model.*;

public interface SavePostPort {

    void savePost(final Post post);
}
