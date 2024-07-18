package com.blogging.blogging_platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blogging.blogging_platform.entity.Post;
import com.blogging.blogging_platform.service.PostService;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/posts")
    public Post createPost(@RequestBody Post post) {
        return postService.savePost(post);
    }

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postService.getPost();
    }

    @GetMapping("/posts/{id}")
    public Post getPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    }

    @PutMapping("/posts/{id}")
    public Post updatePostById(@PathVariable Long id, @RequestBody Post post) {
        return postService.updatePostById(id, post);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePostById(@PathVariable Long id) {
        postService.deletePostById(id);
    }
}
