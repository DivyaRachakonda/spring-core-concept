package com.spring.demo.MyProject3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class AppConfig {

    @Bean
    public Student student() {

        List<String> subjects = Arrays.asList("Java", "Spring", "Database");

        Map<String, Integer> marks = new HashMap<>();
        marks.put("Java", 90);
        marks.put("Spring", 95);
        marks.put("Database", 88);

        return new Student(subjects, marks);
    }
}