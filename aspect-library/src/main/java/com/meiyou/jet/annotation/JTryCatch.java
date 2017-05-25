package com.meiyou.jet.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhengxiaobin@xiaoyouzi.com
 * @since 17/5/24
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface JTryCatch {
}
