package com.example.app.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration //config file
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student essa = new Student(
                1L,
                "Essa",
                "eshomali@gmail.com",
                LocalDate.of(1993, 01, 25),
                29
            );

            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(1994, 02, 26),
                    30
            );

            repository.saveAll(
              List.of(essa, mariam)      
            );
        };
    }
}
