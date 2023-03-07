package com.example.app2;

import com.example.app2.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//@RestController
@SpringBootApplication
public class App2Application {

	public static void main(String[] args) {
		SpringApplication.run(App2Application.class, args);
	}
	//*
//	@GetMapping(path = "/")
//	public String hello()
//	{
//		return "Hello Mary";
//	}
//	@GetMapping(path="api")
//	public List<String> words()
//	{
//		return List.of("hello", "World");
//	}


}
