package com.alexandre_valay.mon_projet_github; // Vérifiez bien cette ligne !

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MonProjetGithubApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonProjetGithubApplication.class, args);
    }
}

@RestController
class HelloWorldController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello, World!";
    }
}
