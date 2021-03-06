package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.ManyToMany.example2;

import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Profile("ManyToMany")
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(Long id) {
        super(id + " not found.");
    }
}
