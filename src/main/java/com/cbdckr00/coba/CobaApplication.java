package com.cbdckr00.coba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class CobaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CobaApplication.class, args);
	}

	@GetMapping
	public String sayHello(){
		return "Hello from springboot application";
	}

}
