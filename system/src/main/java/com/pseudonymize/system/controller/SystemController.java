package com.pseudonymize.system.controller;

import com.pseudonymize.system.repository.GreetRepository;
import com.pseudonymize.system.entity.Greet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class SystemController {

    private final GreetRepository repo;

    public SystemController(GreetRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/internal/greet")
    public Map<String, String> getHello() {
        String message = repo.findAll().stream()
                .findFirst()
                .map(Greet::getMessage)
                .orElse("No greetings found in DB");

        return Collections.singletonMap("data", message);
    }
}