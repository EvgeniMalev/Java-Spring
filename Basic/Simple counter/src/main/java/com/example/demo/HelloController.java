package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/countdown")
    public String countdown() {
        StringBuilder countdown = new StringBuilder();
        for (int i = 25; i >= 0; i--) {
            countdown.append(i).append(" ");
        }
        return countdown.toString();
    }
}
