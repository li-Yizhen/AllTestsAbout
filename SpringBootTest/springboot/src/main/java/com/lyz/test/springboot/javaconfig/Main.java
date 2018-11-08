package com.lyz.test.springboot.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.StringUtils;

/**
 * @Auther: Li_Yizhen
 * @Date: 2018/11/8 16:19
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        //System.out.println(useFunctionService.sayHello("java config"));
        String java_config = useFunctionService.SayHello("java config");
        if (StringUtils.isEmpty(java_config)) {
            System.out.println("空");
            context.close();
        }
        System.out.println(java_config);
        context.close();
    }
}
