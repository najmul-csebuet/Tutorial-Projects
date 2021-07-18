package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.OneToMany;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    private final BookRepository bookRepository;

    public MyRestController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable Long id) {
        Book book = bookRepository.findById(id).get();
        return book;
    }
}
