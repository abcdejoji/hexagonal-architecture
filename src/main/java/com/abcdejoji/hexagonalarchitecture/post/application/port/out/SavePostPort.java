package com.abcdejoji.hexagonalarchitecture.post.application.port.out;

import com.abcdejoji.hexagonalarchitecture.post.application.domain.*;

public interface SavePostPort {

    void savePost(final Post post);
}
