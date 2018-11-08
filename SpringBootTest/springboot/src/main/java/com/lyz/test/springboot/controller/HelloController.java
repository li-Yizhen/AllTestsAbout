package com.lyz.test.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Li_Yizhen
 * @Date: 2018/11/8 14:19
 * @Description:
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello springboot";
    }
}
