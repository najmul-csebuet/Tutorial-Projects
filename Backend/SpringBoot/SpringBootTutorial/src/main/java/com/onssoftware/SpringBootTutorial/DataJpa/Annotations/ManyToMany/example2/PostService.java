package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.ManyToMany.example2;

import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPost() {
        List<Post> postList = postRepository.findAll(Sort.by("title"));
        //ResponseEntity<List<Post>> body = ResponseEntity.ok().body(postList);
        if (postList == null || postList.isEmpty()) {
            ResponseStatusException not_found = new ResponseStatusException(HttpStatus.BAD_REQUEST, "Not found");
            throw not_found;
        }
        return postList;
    }

    public ResponseEntity<List<Post>> fetchAllPosts() {
        return ResponseEntity.ok(postRepository.findAll());
    }

    public ResponseEntity<Post> createNewPost(Post newPost) {
        postRepository.save(newPost);
        return ResponseEntity.ok(newPost);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
        postRepository.flush();

        if (postRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Sorry, deletion failed.");
        }
    }
}
