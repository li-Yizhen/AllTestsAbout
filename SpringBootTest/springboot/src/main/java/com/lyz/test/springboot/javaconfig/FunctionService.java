package com.lyz.test.springboot.javaconfig;

import org.springframework.stereotype.Service;

/**
 * @Auther: Li_Yizhen
 * @Date: 2018/11/8 16:15
 * @Description:
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "hello " + word;
    }
}
