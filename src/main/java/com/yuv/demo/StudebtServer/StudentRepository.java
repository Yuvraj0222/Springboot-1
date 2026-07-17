package com.yuv.demo.StudebtServer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<com.yuv.demo.StudentServer.Student,Integer>{

//    public Student save(Student student){
//        System.out.println("Student information saved");
//        return student;
//    }
}