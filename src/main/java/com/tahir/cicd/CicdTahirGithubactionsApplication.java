package com.tahir.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdTahirGithubactionsApplication {

	@GetMapping("/greetings")
	public String welcome(){
		return "Welcome to Java";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdTahirGithubactionsApplication.class, args);
	}

}
