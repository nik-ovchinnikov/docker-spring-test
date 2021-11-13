package com.niki.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

    @GetMapping("/")
    public String sayHello(@RequestParam(value= "myName", defaultValue = "Docker")String name) {
    return String.format("Hello, Hello Hello Privet !!!!!!!Mister Docker! %s!", name);
    }

}
