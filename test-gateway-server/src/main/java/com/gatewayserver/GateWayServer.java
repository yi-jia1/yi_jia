package com.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GateWayServer {


    public static void main(String[] args) {
        SpringApplication.run(GateWayServer.class);
    }

    @RequestMapping("testHelth")
    public String test(){
        System.out.println("========gateWayServer========");
        return "ok-gateway-server";
    }

}
