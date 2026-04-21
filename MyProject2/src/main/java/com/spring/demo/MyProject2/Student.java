package com.spring.demo.MyProject2;

public class Student {

    private int id;
    private String name;
    private int age;
    private String course;
    private String email;

    public Student(int id, String name, int age, String course, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.email = email;
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Course: " + course);
        System.out.println("Student Email: " + email);
        System.out.println("----------------------");
    }
}