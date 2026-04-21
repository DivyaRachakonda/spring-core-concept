package com.spring.demo.MyProject2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student s1 = context.getBean("student1", Student.class);
        Student s2 = context.getBean("student2", Student.class);
        Student s3 = context.getBean("student3", Student.class);

        s1.display();
        s2.display();
        s3.display();
    }
}