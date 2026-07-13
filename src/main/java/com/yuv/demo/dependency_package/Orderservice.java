package com.yuv.demo.dependency_package;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Orderservice {

//    @Autowired
    paymentservice Paymentservice;

    Orderservice(paymentservice Paymentservice){
        this.Paymentservice = Paymentservice;

    }

//    @Autowired
    public void setPaymentservice(paymentservice Paymentservice) {
        this.Paymentservice = Paymentservice;
    }

    public  void placeorder() {
        Paymentservice.payment();
        System.out.println("Order Places");
    }
}
