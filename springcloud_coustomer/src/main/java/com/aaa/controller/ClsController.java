package com.aaa.controller;

import com.aaa.dao.ClsDao;
import com.aaa.entity.Cls;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class ClsController {
    @Resource
    ClsDao clsDao;
    @RequestMapping(value = "findall",produces="application/json")
    public List<Cls>findall(){
        return clsDao.findall();
    }

    @RequestMapping(value = "addcls",produces = "application/json")
    @ResponseBody
    public String add(@RequestBody Cls cls){
        String i=clsDao.clsadd(cls);
        return "ok";
    }

    @RequestMapping(value = "updcls",produces = "application/json")
    @ResponseBody
    public String updcls(@RequestBody Cls cls){
        System.out.println(cls);
        String i=clsDao.clsupd(cls);
        return "ok";
    }

    @RequestMapping(value = "upddel",produces = "application/json")
    @ResponseBody
    public String upddel(@RequestBody Cls cls){
        System.out.println(cls);
        String i=clsDao.clsdel(cls);
        return "ok";
    }
}
