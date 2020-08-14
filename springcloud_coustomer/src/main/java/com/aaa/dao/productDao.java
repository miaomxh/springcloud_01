package com.aaa.dao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface productDao {
    @RequestMapping("/user/getuser")
    String getUser();
    @RequestMapping(value = "user/add",produces = "application/json")
    public Object add(@RequestParam("a") Integer a,@RequestParam("b") Integer b);
}
