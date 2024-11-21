package com.codeguru.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/test/api")
public class CicdApplication {

    @GetMapping("/")
    public String Greet() {
        return "Welcome to devops";
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdApplication.class, args);
    }

}
