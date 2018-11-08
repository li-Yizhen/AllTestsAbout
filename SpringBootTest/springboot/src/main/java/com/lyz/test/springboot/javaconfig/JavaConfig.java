package com.lyz.test.springboot.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Li_Yizhen
 * @Date: 2018/11/8 16:17
 * @Description:
 */
@Configuration
@ComponentScan("com.lyz.test.springboot.javaconfig")
public class JavaConfig {

    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

}
