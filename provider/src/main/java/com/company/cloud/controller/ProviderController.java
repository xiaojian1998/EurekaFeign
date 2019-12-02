package com.company.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @RequestMapping("provider")
    public String test(){
        return "Fegin 调用成功";
    }
}
