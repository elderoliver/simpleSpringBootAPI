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
            Student elder = new Student(
                    "Elder Oliveira Castro",
                    "elderoliveiracastro@gmail.com",
                    LocalDate.of(1990, Month.DECEMBER, 12)
            );

            Student fernanda = new Student(
                    "Fernanda Almeida Rodrigues",
                    "fernanda.srmenina@gmail.com",
                    LocalDate.of(1992, Month.JANUARY, 17)
            );

            repository.saveAll(List.of(elder,fernanda));
        };
    }
}
