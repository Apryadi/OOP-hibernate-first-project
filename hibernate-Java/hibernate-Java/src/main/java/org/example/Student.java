package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student extends User {

    public Student() {
    }

    public Student(String name, int age, String major) {
        super(name, age, major);
    }
}
