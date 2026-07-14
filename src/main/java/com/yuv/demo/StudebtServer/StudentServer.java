package com.yuv.demo.StudebtServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {
//    1. store the student
    @PostMapping("/create")
    public String storeStudent(){
        return """
                id : 1
                name: Yuvraj
                Dept : CSE
                age : 20
                """;
    }
//    2. Read the student with id

//    3. update hte student info

//    4. Delete the student info
}
