package com.aaa.dao;

import com.aaa.entity.Dl;
import com.aaa.impl.Dlimpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(value = "springcloudproduct2",fallback = Dlimpl.class)
public interface DlDao {
    /*@RequestMapping(value = "dl/login",produces = "application/json")
    Dl login(@RequestBody Dl dl);*/
}
