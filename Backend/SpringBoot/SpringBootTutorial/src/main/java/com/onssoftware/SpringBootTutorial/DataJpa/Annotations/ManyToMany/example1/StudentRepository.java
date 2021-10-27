package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.ManyToMany.example1;

import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("ManyToMany")
public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByNameContaining(String name);
}