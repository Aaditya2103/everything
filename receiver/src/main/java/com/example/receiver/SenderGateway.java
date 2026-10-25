package com.example.receiver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "sender", url = "${sender.url}")
public interface SenderGateway {
    @GetMapping("/info")
    String getInfo();
}
