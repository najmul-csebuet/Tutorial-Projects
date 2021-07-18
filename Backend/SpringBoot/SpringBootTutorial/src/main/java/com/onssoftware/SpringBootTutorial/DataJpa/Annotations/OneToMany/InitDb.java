package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.OneToMany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class InitDb {
    @Bean
    public CommandLineRunner mappingDemo(BookRepository bookRepository,
                                         PageRepository pageRepository) {
        return args -> {

            Optional<Book> byId = bookRepository.findById(1l);
            Book book = byId.get();
            System.out.println(book);
            /*// create a new book
            Book book = new Book("Java 101", "John Doe", "123456");

            // save the book
            bookRepository.save(book);

            // create and save new pages
            pageRepository.save(new Page(1, "Introduction contents", "Introduction", book));
            pageRepository.save(new Page(65, "Java 8 contents", "Java 8", book));
            pageRepository.save(new Page(95, "Concurrency contents", "Concurrency", book));*/
        };
    }
}
