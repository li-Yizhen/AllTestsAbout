package com.lyz.test.springboot.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Auther: Li_Yizhen
 * @Date: 2018/11/8 17:43
 * @Description: 切面
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.lyz.test.springboot.aop.Action)")
    public void annotationPointCut(){};
}
