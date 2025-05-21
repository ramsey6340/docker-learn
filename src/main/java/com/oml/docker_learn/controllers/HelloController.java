package com.oml.docker_learn.controllers;

import com.oml.docker_learn.controllers.services.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {
    final private HelloService service;

    @GetMapping("/hello")
    public String sayHell() {
        return service.sayHello();
    }
}
