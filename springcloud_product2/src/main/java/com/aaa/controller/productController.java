package com.aaa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
    @RequestMapping("user/getuser")
    public String getuser(){
        return "name:李四,age=12";
    }
    @RequestMapping(value = "user/add",produces = "application/json")
    public Object useradd(Integer a,Integer b){
        return a+b;
    }
}
