package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.ManyToMany.example1;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Long> {

    List<Course> findByTitleContaining(String title);

    List<Course> findByFeeLessThan(double fee);
}