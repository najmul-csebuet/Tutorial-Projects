package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.ManyToMany.example2;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Profile("ManyToMany")
@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
