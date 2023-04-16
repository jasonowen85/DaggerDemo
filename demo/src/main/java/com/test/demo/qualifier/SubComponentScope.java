package com.test.demo.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.inject.Scope;

/**
 * 文件命名 注解
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface SubComponentScope {
}
