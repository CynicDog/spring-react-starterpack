package com.pseudonymize.channel.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ChannelController {

    private final RestClient restClient;

    public ChannelController(@Value("${SYSTEM_URL:http://system:8080}") String systemUrl) {
        this.restClient = RestClient.builder()
                .baseUrl(systemUrl)
                .build();
    }

    @GetMapping("/api/relay")
    public Map<String, Object> relay() {
        return restClient.get()
                .uri("/internal/greet")
                .retrieve()
                .body(new ParameterizedTypeReference<Map<String, Object>>() {});
    }
}