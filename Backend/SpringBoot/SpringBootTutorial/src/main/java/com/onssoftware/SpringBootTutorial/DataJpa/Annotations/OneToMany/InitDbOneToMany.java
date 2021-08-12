package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.OneToMany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.*;

// -1
@Component
@Profile("OneToMany")
public class InitDbOneToMany {
    @Bean
    public CommandLineRunner oneToManyMappingDemo(BookRepository bookRepository,
                                                  PageRepository pageRepository) {
        return args -> {

            // create a new book
            Book book = new Book("Java 101", "John Doe", "123456");

            // save the book
            bookRepository.save(book);

            // create and save new pages
            pageRepository.save(new Page(1, "Introduction contents", "Introduction", book));
            pageRepository.save(new Page(65, "Java 8 contents", "Java 8", book));
            pageRepository.save(new Page(95, "Concurrency contents", "Concurrency", book));
        };
    }

    /*@Bean
    public CommandLineRunner oneToManyMappingDemo(BookRepository bookRepository,
                                                  PageRepository pageRepository) {
        return args -> {

            // create a new book
            Book book = new Book("Java 101", "John Doe", "123456");

            // create and save new pages
            Page entity = new Page(1, "Introduction contents", "Introduction", book);
            Page entity1 = new Page(65, "Java 8 contents", "Java 8", book);
            Page entity2 = new Page(95, "Concurrency contents", "Concurrency", book);


            book.getPages().addAll(Arrays.asList(entity, entity1, entity2));

            // save the book
            bookRepository.save(book);
        };
    }*/
}
