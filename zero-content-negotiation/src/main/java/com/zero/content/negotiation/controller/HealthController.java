package com.zero.content.negotiation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {


    /**
     *
     * <a href="http://localhost:8080?format=xml">使用xml格式的内容返回报文</a>
     * <a href="http://127.0.0.1:8080?format=json">使用json格式的内容返回报文</a>
     *
     */
    @RequestMapping("/")
    public Map<String, Object> checkHealth() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("status", "success");
        map.put("message", "Welcome to Service");
        map.put("result", "服务正常运行中");
        return map;
    }

}