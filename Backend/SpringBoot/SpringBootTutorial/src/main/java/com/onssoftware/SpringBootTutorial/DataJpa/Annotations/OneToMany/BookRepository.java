package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.OneToMany;

import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Profile("OneToMany")
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByIsbn(String isbn);
}