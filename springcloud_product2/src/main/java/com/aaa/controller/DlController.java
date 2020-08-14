package com.aaa.controller;

import com.aaa.dao.DlDao;
import com.aaa.entity.Dl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
public class DlController {
    @Resource
    DlDao dlDao;

    @RequestMapping(value = "dl/login",produces = "application/json")
    @ResponseBody
    public Dl yhLogin(@RequestBody  Dl dl){
        Dl login = dlDao.login(dl);
        System.out.println(login);
        if (login!=null){
            return login;
        }else{
            return null;
        }
    }
}
