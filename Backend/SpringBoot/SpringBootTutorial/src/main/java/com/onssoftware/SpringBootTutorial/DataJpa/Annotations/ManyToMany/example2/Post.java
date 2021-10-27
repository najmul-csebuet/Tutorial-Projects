package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.ManyToMany.example2;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import org.springframework.context.annotation.Profile;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

//@Entity
@Table(name = "post")
@Getter
@Setter
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "@id", scope = Post.class)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(unique = true, nullable = false)
    private String title;

    @NotNull
    @Size(min = 10, max = 250)
    private String description;

    @NotNull
    @Lob
    private String content;

    /*
        When you do as you show date object actually has no changes.
        Only thing that happens: you create String that contains formatted date.
        So you can specify DateTimeFormat pattern to store date in that pattern instead.
        Also note, that "hh" string in your date pattern actually will give you value from 1 to 12. It is AM/PM hour.
        To get 0-24 hours value use "HH" instead
        (see http://docs.oracle.com/javase/6/docs/api/java/text/SimpleDateFormat.html, "Date and Time Patterns" section)
    */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "posted_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date postedAt = new Date();

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_updated_at")
    private Date lastUpdatedAt = new Date();

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinTable(
            name = "post_tag",
            joinColumns = {@JoinColumn(name = "post_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "tag_id", referencedColumnName = "id")}
    )
    private Set<Tag> tags = new HashSet<>();

    /*@ManyToMany
    @JoinTable(name = "POST_TAG",
            joinColumns = @JoinColumn(name = "POST_ID"),
            inverseJoinColumns = @JoinColumn(name = "TAG_ID"))
    private List<Tag> tags;*/

    public Post(String title, String description, String content) {
        this.title = title;
        this.description = description;
        this.content = content;
    }

    public Post(String title, String description, String content, Set<Tag> tags) {
        this(title, description, content);
        this.tags = tags;
    }
}
