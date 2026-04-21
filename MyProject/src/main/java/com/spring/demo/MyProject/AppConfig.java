package com.spring.demo.MyProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Student student() {

        Student s = new Student();
        s.setId(101);
        s.setName("John");

        return s;
    }
}