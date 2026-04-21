package com.spring.demo.MyProject;

public class Student {

    private int id;
    private String name;

    public Student() {
        System.out.println("Student object created");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Initialization method
    public void init() {
        System.out.println("Bean initialization method called");
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    // Destroy method
    public void destroy() {
        System.out.println("Bean destroy method called");
    }
}