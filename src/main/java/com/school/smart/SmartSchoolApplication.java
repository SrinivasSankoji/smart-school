package com.school.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SmartSchoolApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SmartSchoolApplication.class, args);
    }

    @GetMapping
    public String getMessage() {
        return "Smart school application";
    }

}
