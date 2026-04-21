package com.spring.demo.MyProject3;

import java.util.List;
import java.util.Map;

public class Student {

    private List<String> subjects;
    private Map<String, Integer> marks;

    public Student(List<String> subjects, Map<String, Integer> marks) {
        this.subjects = subjects;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Subjects: " + subjects);
        System.out.println("Marks: " + marks);
    }
}