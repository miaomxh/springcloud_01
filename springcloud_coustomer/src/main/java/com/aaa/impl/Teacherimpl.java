package com.aaa.impl;

import com.aaa.dao.TeacherDao;
import com.aaa.entity.Teacher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class Teacherimpl implements TeacherDao {

    @Override
    public Object findall() {
        return "查询无数据";
    }

    @Override
    public String del(@RequestBody Teacher teacher) {
        return "删除失败";
    }

    @Override
    public String add(Teacher teacher) {
        return "添加失败";
    }

    @Override
    public String upd(Teacher teacher) {
        return "修改失败";
    }
}
