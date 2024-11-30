package com.example.ac2_ca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan(basePackages = "entity")
@EnableJpaRepositories(basePackages = "repository")
@RestController // Define que a classe é um controlador REST
public class Ac2CaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ac2CaApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }
}
