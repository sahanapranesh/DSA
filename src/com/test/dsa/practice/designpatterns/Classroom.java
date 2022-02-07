package com.test.dsa.practice.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student> studentList;

    private static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public Classroom(){

    }
}
