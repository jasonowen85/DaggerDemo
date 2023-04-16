package com.test.demo.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * CommonComponent 专用 annotation 类似文件name 一样作用 增加代码可读性
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface CommonScope {

}
