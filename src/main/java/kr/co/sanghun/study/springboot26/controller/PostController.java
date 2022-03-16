package kr.co.sanghun.study.springboot26.controller;

import kr.co.sanghun.study.springboot26.model.Post;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PostController {

    @GetMapping("/posts")
    public List<String> findAllPosts() {
        return List.of("Post 1", "Post 2", "Post 3");
    }

    @GetMapping("/posts/{name}/{name}")
    public void findPostByAuthor(@PathVariable String name) {
        System.out.println("name: " + name);
    }

    @PostMapping("/posts")
    public void create(@Valid @RequestBody Post post) {
        System.out.println(post);
    }
}
