package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/t")
@RestController
public class helloworld {
   @RequestMapping("/t1")
    public String test(){
       return "ｈｔｌ测试jenkins成功,不使用ｍａｖｅｎ指定仓库，而是使用默认ｊｅｎｋｉｎｓ的ｍａｖｅｎ仓库";
   }
}
