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
    @GetMapping("/Skill")
    public String Skill(){
        return """
                <h2> Technical Skills</h2>
                <ul>
                <li> Java</li>
                <li> mysql</li>
                <li> DSA</li>
                <li> Spring boot</li>
                <li> Maven</li>
                </ul>
                
                
                
                """;
    }

    @GetMapping("/education")
    public String education(){
        return """
                <h2> Education</h2>
                <ul>
                <li> LPU</li>
                <li> Saint James School</li>
                
                </ul>
                
                """;
    }

    @GetMapping("/project")
    public String project() {
        return """
                <h2> Project</h2>
                <ul>
                <li> TB- Dectection ml model</li>
                <li>Ai assitence</li>
                
                </ul>
                
                """;
    }
}
