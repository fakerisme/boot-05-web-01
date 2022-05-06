package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class TestController {


    @GetMapping("/cars/{id}/{id1}")
    public Map<String,Object> welcomePage(@PathVariable("id") Integer id,
                                          @PathVariable Map<String,Object> ids,
                                          @RequestParam("name") String name){
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        Set<String> keys = ids.keySet();
        for (String key: keys){
            System.out.println(ids.get(key));
        }
        return map;
    }

    @PostMapping("/save")
    public Map<String, Object> save(@RequestBody String context){
        Map<String, Object> map = new HashMap<>();
        map.put("context", context);
        return map;
    }
}
