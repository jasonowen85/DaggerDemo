package com.test.demo.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * adas 专用 annotation 类似文件name 一样作用 增加代码可读性
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface AdasScope {

}
