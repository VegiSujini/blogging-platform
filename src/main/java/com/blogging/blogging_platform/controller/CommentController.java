package com.blogging.blogging_platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blogging.blogging_platform.entity.Comment;
import com.blogging.blogging_platform.service.CommentService;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/posts/{id}/comments")
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @GetMapping("/posts/{id}/comments")
    public List<Comment> getComments() {
        return commentService.getComments();
    }
}
