package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Application {   

    @GetMapping("/")
    public String home() {
        return "Hello from Jenkins + Java + Docker!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // 👈 also updated here
    }
}