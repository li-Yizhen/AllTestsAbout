package com.lyz.test.springboot.aop;

import java.lang.annotation.*;

/**
 * @Auther: Li_Yizhen
 * @Date: 2018/11/8 17:38
 * @Description: 拦截规则类
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
