package com.aaa.controller;

import com.aaa.dao.TeacherDao;

import com.aaa.entity.Teacher;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TeacherController {
    @Resource
    TeacherDao teacherDao;
    @RequestMapping(value = "tea/teafind",produces = "application/json")
    @ResponseBody
    public Object findall(){
        Map<String,Object> map=new HashMap<String, Object>();
        List<Teacher> teachers = teacherDao.selectAll();
        System.out.println(teachers);
        PageInfo<Teacher> pageInfo = new PageInfo<Teacher>(teachers);
        map.put("pageInfo", pageInfo);
        map.put("pageNum", 1);
        map.put("size", 2);
        return map;
    }

    @RequestMapping(value = "tea/chaxun",produces = "application/json")
    @ResponseBody
    public Object listquery(){
        List<Teacher>listtea=teacherDao.selectAll();
        System.out.println(listtea);
        return listtea;
    }
    @RequestMapping(value ="tea/teadel",produces = "application/json")
    @ResponseBody
    public String teadel(@RequestBody Teacher teacher){
        System.out.println(teacher);
        int i = teacherDao.deleteByPrimaryKey(teacher);
        System.out.println(i);
        //List<Teacher>listtea=teacherDao.selectAll();
        return "ok";
    }
    @RequestMapping(value = "tea/teaadd",produces = "application/json")
    @ResponseBody
    public String teaadd(@RequestBody Teacher teacher){
        //System.out.println("1111111111111111111111111111111111111111111");
        //System.out.println(teacher);
        int i = teacherDao.insertSelective(teacher);
        //List<Teacher>listtea=teacherDao.selectAll();
        return "ok";
    }
    @RequestMapping(value = "tea/teaupd",produces = "application/json")
    @ResponseBody
    public String teaupd(@RequestBody Teacher teacher){
        int i = teacherDao.updateByPrimaryKeySelective(teacher);
        //List<Teacher>listtea=teacherDao.selectAll();
        return "ok";
    }
    @RequestMapping(value = "tea/test")
    public String test(){
        return "ok";
    }


}

