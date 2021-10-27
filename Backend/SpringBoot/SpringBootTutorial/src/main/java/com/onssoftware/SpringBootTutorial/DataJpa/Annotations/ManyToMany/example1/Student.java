package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.ManyToMany.example1;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
//@Entity
@Table(name = "students")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String grade;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "students_courses",
//            joinColumns = {
//                    @JoinColumn(name = "student_id", referencedColumnName = "id",
//                            nullable = false, updatable = false)},
//            inverseJoinColumns = {
//                    @JoinColumn(name = "course_id", referencedColumnName = "id",
//                            nullable = false, updatable = false)})
    private Set<Course> courses = new HashSet<>();

    public Student() {
    }

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // getters and setters, equals(), toString() .... (omitted for brevity)
}