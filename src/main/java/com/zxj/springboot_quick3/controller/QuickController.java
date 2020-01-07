package com.zxj.springboot_quick3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController {

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick(){
        return "springboot !!!";
    }

}
