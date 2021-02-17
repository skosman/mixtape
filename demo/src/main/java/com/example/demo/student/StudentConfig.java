package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student bob = new Student(
                    "Bob",
                    "bobtest@test.com",
                    LocalDate.of(2001, Month.JANUARY, 1)
            );
            Student sally = new Student(
                    "Sally",
                    "sallytest@test.com",
                    LocalDate.of(2003, Month.APRIL, 2)
            );

            repository.saveAll(
                    List.of(bob, sally)
            );
        };
    }
}
