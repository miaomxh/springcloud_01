package com.aaa.dao;

import com.aaa.entity.Teacher;
import com.aaa.impl.Teacherimpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "springcloudproduct2",fallback = Teacherimpl.class)
public interface TeacherDao {
    @RequestMapping(value = "tea/chaxun",produces="application/json")
    Object findall();
    @RequestMapping(value = "tea/teadel",produces="application/json")
    String del(@RequestBody Teacher teacher);
    @RequestMapping(value = "tea/teaadd",produces = "application/json")
    String add(@RequestBody Teacher teacher);
    @RequestMapping(value = "tea/teaupd",produces="application/json")
    String upd(@RequestBody Teacher teacher);
}
