package com.rock.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //@RestController= @@Controller + @ResponseBody
public class Test_Contrl {

    @RequestMapping("/a")
    public String helloword(){
        return "helloworld";
    }
}