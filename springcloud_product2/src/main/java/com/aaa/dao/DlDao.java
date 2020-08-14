package com.aaa.dao;

import com.aaa.entity.Dl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestBody;

@Mapper
public interface DlDao extends tk.mybatis.mapper.common.Mapper<Dl> {
    @Select("select did,dname,dpwd from dl where dname=#{dname} and dpwd=#{dpwd}")
    Dl login(@RequestBody Dl dl);
}
