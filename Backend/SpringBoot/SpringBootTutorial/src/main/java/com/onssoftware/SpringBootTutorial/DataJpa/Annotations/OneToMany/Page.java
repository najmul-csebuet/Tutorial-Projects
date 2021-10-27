package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.ToString;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;
import java.io.Serializable;

@Getter
//@Entity
@Table(name = "pages")
public class Page implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int number;
    private String content;
    private String chapter;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    public Page() {
    }

    public Page(int number, String content, String chapter, Book book) {
        this.number = number;
        this.content = content;
        this.chapter = chapter;
        this.book = book;
    }

    // getters and setters, equals(), toString() .... (omitted for brevity)
}