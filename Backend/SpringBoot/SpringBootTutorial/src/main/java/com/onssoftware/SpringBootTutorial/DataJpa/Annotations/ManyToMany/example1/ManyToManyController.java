package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.ManyToMany.example1;

import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Profile("ManyToMany")
public class ManyToManyController {

    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;

    public ManyToManyController(CourseRepository courseRepository, StudentRepository studentRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
    }

    @GetMapping("/course")
    public ResponseEntity<List<Course>> getAllCourse() {
        Iterable<Course> all = courseRepository.findAll();
        List<Course> list = new ArrayList<>();
        all.forEach(list::add);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAllStudent() {
        Iterable<Student> all = studentRepository.findAll();
        List<Student> list = new ArrayList<>();
        all.forEach(list::add);
        //return ResponseEntity.ok().body(list.get(0));
        //return new ResponseEntity<>(list, HttpStatus.OK);
        return ResponseEntity.accepted().body(list);
    }

    /*@GetMapping("/student")
    public Student getAllStudent() {
        Iterable<Student> all = studentRepository.findAll();
        List<Student> list = new ArrayList<>();
        all.forEach(list::add);
        return list.get(0);
    }*/
}
