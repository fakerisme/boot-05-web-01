package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class controller1 {

    @GetMapping("/goto")
    public String gotopage(HttpServletRequest request){
        request.setAttribute("message", "成功了");
        request.setAttribute("message2", "成功了2");
            return "forward:/success";
    }
    @GetMapping("/goin")
    public String goinpage(HttpServletRequest request){
        request.setAttribute("message", "成功了");
        request.setAttribute("message2", "成功了2");
        return "forward:/success";
    }
    @ResponseBody
    @GetMapping("/success")
    public Map<String, Object> getSuccess(@RequestAttribute("message") String message){

        HashMap<String, Object> maps = new HashMap<>();
        maps.put("message", message);
        return maps;
    }
}
