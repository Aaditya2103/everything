package com.example.sender;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/info")
    String call() {
        return "Sender said ";
    }

    @GetMapping
    String getHello() {
        return "hello";
    }
}
