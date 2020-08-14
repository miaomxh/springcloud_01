package com.aaa.controller;

import com.aaa.dao.ClsDao;
import com.aaa.entity.Cls;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ClsController {
    @Resource
    ClsDao clsDao;
    @RequestMapping(value = "cls/findall",produces = "application/json")
    @ResponseBody
    public List<Cls>findall(){
        List<Cls>cls=clsDao.selectAll();
        return cls;
    }

    @RequestMapping(value = "cls/clsadd")
    @ResponseBody
    public String clsadd(@RequestBody  Cls cls){
        int i=clsDao.insertSelective(cls);
        return "ok";
    }

    @RequestMapping(value = "cls/clsupd")
    @ResponseBody
    public String clsupd(@RequestBody Cls cls){
        int i=clsDao.updateByPrimaryKeySelective(cls);
        return "ok";
    }

    @RequestMapping(value = "cls/clsdel")
    @ResponseBody
    public String clsdel(@RequestBody Cls cls){
        System.out.println("pro"+cls);
        int i=clsDao.deleteByPrimaryKey(cls);
        System.out.println("pro"+i);
        return "ok";
    }
}
