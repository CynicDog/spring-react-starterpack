package com.pseudonymize.system.config;

import com.pseudonymize.system.entity.Greet;
import com.pseudonymize.system.repository.GreetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(GreetRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                Greet greeting = new Greet();
                greeting.setMessage("Hello World from Postgres!! \uD83D\uDE01 ");
                repository.save(greeting);
                System.out.println(">> Database seeded successfully!");
            } else {
                System.out.println(">> Database already contains data.");
            }
        };
    }
}