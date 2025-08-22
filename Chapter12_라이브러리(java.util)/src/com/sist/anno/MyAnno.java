package com.sist.anno;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
// @MyAnno(value="")  @MyAnno
@Retention(RUNTIME)
@Target(METHOD)
public @interface MyAnno {
    public String value();
    int count() default 1;
}
