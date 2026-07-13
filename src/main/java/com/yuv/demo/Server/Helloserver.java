package com.yuv.demo.Server;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloserver    {

    @GetMapping("/hello")
    public String hello(){
        return "Hello YUVRAJ";

    }
}
