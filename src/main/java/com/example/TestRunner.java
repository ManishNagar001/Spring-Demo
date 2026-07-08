package com.example;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

 System.out.println("ENV = " + System.getenv("GOOGLE_GENAI_API_KEY"));

    SpringApplication.run(AiApplication.class, args);
}
