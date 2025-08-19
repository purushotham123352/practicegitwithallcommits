package com.example.gitpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitpracticeApplication {

	public String get(){
		return "Hello .....";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitpracticeApplication.class, args);
	}

}
