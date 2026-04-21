package com.spring.demo.MyProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student s = context.getBean(Student.class);

        s.display();

        context.close();
    }
}