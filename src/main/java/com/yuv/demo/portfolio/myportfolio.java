package com.yuv.demo.portfolio;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myportfolio {

    @GetMapping("/mySelf")
    public String Myself(){
        return  """
                <h1> Myself</h1>
                <p>Simple line about myself</p>
                <ul>
                <li> gitHub link : Link </li>
                <li> Leetcode link: link link </li>
                </ul>
                
                """;
    }
}
