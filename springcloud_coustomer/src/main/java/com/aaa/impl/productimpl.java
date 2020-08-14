package com.aaa.impl;

import com.aaa.dao.productDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class productimpl implements productDao {
    @Override
    public String getUser() {
        return "没有查询到用户信息";
    }

    @Override
    public Object add(Integer a, Integer b) {
        return "添加失败";
    }
}
