package com.aaa.controller;

import com.aaa.dao.productDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    productDao productDao2;
    @RequestMapping("/test")
    public String t1(){
        return "t1";
    }

    @RequestMapping("/getuser")
    public String t2(){
        String user=productDao2.getUser();
        return user;
    }

    @RequestMapping(value = "useradd",produces = "application/json")
    public Object useradd(Integer a,Integer b){
        return a+b;
    }
}
