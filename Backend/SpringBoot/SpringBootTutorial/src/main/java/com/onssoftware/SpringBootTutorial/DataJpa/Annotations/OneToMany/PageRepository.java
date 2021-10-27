package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.OneToMany;

import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Profile("OneToMany")
@Repository
public interface PageRepository extends CrudRepository<Page, Long> {

    List<Page> findByBook(Book book, Sort sort);
}