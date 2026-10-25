package com.example.receiver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private SenderGateway senderGateway;
    public Controller(SenderGateway senderGateway) {
        this.senderGateway = senderGateway;
    }

    @GetMapping("/call")
    String call() {
        return senderGateway.getInfo() + "hello";
    }

    @GetMapping
    String getHello() {
        return "hello";
    }
}
