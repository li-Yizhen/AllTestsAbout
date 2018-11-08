package com.lyz.test.springboot.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Auther: Li_Yizhen
 * @Date: 2018/11/8 16:16
 * @Description:
 */
@Service
public class UseFunctionService {

    @Autowired
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word) {
        String hello = functionService.sayHello(word);
        if (StringUtils.isEmpty(hello)) {
            System.out.println(">>>>>>>>>>>>>>UseFunctionService sayHello 为空");
            return "UseFunctionService结果为空";
        }
        return hello;
    }
}
