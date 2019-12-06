package com.gatewayserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@SpringBootApplication
@RestController
public class GateWayServer2 {

    public static void main(String[] args) {
        SpringApplication.run(GateWayServer2.class);
    }
    @RequestMapping("testHelth2")
    public String test(){
        System.out.println("======gatewayserver2======");
        return "ok gateway-server";
    }

}
