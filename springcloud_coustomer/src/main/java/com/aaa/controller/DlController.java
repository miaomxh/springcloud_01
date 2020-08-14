package com.aaa.controller;

import com.aaa.dao.DlDao;
import com.aaa.entity.Dl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
public class DlController {
    /*@Resource
    DlDao dlDao;

    @RequestMapping(value = "login",produces = "application/json")
    public Dl login(@RequestBody Dl dl){
        Dl dl1=dlDao.login(dl);
        if (dl1!=null){
            return dl1;
        }else
        {
            return null;
        }
    }*/
}
