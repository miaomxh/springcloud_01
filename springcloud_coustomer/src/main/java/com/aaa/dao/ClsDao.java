package com.aaa.dao;

import com.aaa.entity.Cls;
import com.aaa.impl.Clsimpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "springcloudproduct2",fallback = Clsimpl.class)
public interface ClsDao {
    @RequestMapping(value = "cls/findall",produces = "application/json")
    List<Cls>findall();
    @RequestMapping(value = "cls/clsadd" ,produces = "application/json")
    String clsadd(@RequestBody  Cls cls);
    @RequestMapping(value = "cls/clsupd",produces = "application/json")
    String clsupd(@RequestBody Cls cls);
    @RequestMapping(value = "cls/clsdel",produces = "application/json")
    String clsdel(@RequestBody Cls cls);
}
