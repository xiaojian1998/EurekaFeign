package com.company.cloud.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "provider" )
public interface fegin {

    @RequestMapping("provider")
    public String   test();




}
