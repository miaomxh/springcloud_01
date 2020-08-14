package com.aaa.impl;

import com.aaa.dao.ClsDao;
import com.aaa.entity.Cls;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Clsimpl implements ClsDao {
    @Override
    public List<Cls> findall() {
        return null;
    }

    @Override
    public String clsadd(Cls cls) {
        return "添加失败";
    }

    @Override
    public String clsupd(Cls cls) {
        return "修改失败";
    }

    @Override
    public String clsdel(Cls cls) {
        return "删除失败";
    }
}
