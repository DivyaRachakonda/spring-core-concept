package com.spring.demo.MyProject2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student1() {
        return new Student(101, "John", 21, "Computer Science", "john@gmail.com");
    }

    @Bean
    public Student student2() {
        return new Student(102, "Alice", 22, "Information Technology", "alice@gmail.com");
    }

    @Bean
    public Student student3() {
        return new Student(103, "Michael", 23, "Software Engineering", "michael@gmail.com");
    }
}