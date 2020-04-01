package com.esure.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description：
 * @Author 张朋
 * @Date 2020-04-01 15:29
 */
@RestController
public class UserController {

    @RequestMapping("/")
    public Map index(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","张朋");
        map.put("age",38);
        map.put("address","贵州省贵阳市白云区");
        return map;
    }

}
