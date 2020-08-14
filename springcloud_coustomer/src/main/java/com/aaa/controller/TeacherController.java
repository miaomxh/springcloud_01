package com.aaa.controller;

import com.aaa.dao.TeacherDao;
import com.aaa.entity.Teacher;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
public class TeacherController {
    @Resource
    TeacherDao teacherDao;
    @RequestMapping(value = "find",produces = "application/json")
    @ResponseBody
    public Object find(){
        return teacherDao.findall();
    }

    @RequestMapping(value = "del",produces = "application/json")
    @ResponseBody
    public String del(@RequestBody Teacher teacher){
        System.out.println(teacher);
        String del=teacherDao.del(teacher);
        return "ok";
    }

    @RequestMapping(value = "add",produces = "application/json")
    @ResponseBody
    public String add(@RequestBody Teacher teacher){
        String add=teacherDao.add(teacher);
        return "ok";
    }

    @RequestMapping(value = "upd",produces = "application/json")
    @ResponseBody
    public String upd(@RequestBody Teacher teacher){
        String upd=teacherDao.upd(teacher);
        return "ok";
    }
}
