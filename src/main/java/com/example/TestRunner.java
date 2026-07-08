package com.example;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

    @Value("${GOOGLE_GENAI_API_KEY:NOT_FOUND}")
    private String envKey;

    @Value("${spring.ai.google.genai.api-key:PROPERTY_NOT_FOUND}")
    private String propertyKey;

    @Override
    public void run(String... args) {
        System.out.println("ENV KEY      = " + envKey);
        System.out.println("PROPERTY KEY = " + propertyKey);
    }
}