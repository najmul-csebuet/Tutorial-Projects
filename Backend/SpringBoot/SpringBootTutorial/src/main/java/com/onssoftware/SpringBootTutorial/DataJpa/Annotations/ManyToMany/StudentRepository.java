package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.ManyToMany;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByNameContaining(String name);
}