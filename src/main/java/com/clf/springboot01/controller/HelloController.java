package com.clf.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 巧克力爱王子
 * @Date 2021/9/11 9:22
 * @Version 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "Come on,boby!";
    }
}
