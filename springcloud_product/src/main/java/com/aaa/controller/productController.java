package com.aaa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
    @RequestMapping("user/getuser")
    public String test(){
        return "name:张三,age=12";
    }
}
