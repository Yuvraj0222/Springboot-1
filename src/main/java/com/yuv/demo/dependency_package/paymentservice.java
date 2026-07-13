package com.yuv.demo.dependency_package;

import org.springframework.stereotype.Component;

@Component
public class paymentservice {
    public void payment(){
        System.out.println("Payment Done");
    }

}
