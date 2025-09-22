package com.example.javadockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // Root endpoint
    @GetMapping("/")
    public String home() {
        return "✅ Java-Docker-App is running!";
    }

    // Endpoint 1: Say hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello Shahir 🚀";
    }

    // Endpoint 2: Health check
    @GetMapping("/status")
    public String status() {
        return "App is healthy ✅ and deployed via Jenkins + Docker!";
    }

    // Endpoint 3: Version info
    @GetMapping("/version")
    public String version() {
        return "Java-Docker-App v1.1 🏗️ (with updates)";
    }
}