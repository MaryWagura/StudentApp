package com.example.app2.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {
            Student Monday= new Student(
                "Monday",
                "Monday@gmail.com",
                LocalDate.of(2011, Month.FEBRUARY,13)
        );
            Student Tuesday= new Student(
                    "Tuesday",
                    "Tuesday@gmail.com",
                    LocalDate.of(2010, Month.FEBRUARY,13)
            );
            repository.saveAll(
                    List.of(Monday,Tuesday)
            );

        };
    }
}
