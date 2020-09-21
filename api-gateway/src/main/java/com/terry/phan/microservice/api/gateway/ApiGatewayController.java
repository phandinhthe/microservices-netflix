package com.terry.phan.microservice.api.gateway;

import org.springframework.web.bind.annotation.GetMapping;

public interface ApiGatewayController {
    @GetMapping("/greeting")
    String greeting();
}
