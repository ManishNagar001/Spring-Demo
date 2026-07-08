package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AiApplication {

	public static void main(String[] args) {
		  System.out.println("GOOGLE_GENAI_API_KEY = " + System.getenv("GOOGLE_GENAI_API_KEY"));
		SpringApplication.run(AiApplication.class, args);
	}

}
