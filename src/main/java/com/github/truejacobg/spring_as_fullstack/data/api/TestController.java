package com.github.truejacobg.spring_as_fullstack.data.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
class TestController {

    @GetMapping
    String getData() {
        return "Hello World!";
    }
}
