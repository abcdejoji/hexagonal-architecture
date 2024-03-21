package com.abcdejoji.hexagonalarchitecture.config.jacoco;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD, CONSTRUCTOR})
public @interface ExcludeTestGenerated {
}
