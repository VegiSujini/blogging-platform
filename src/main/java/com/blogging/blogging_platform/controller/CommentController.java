package com.blogging.blogging_platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public Comment addComment(@RequestBody Comment comment,@PathVariable Long id) {
        return commentService.saveComment(id,comment);
    }

    @GetMapping("/posts/{id}/comments")
    public List<Comment> getComments(@PathVariable Long id) {
        return commentService.getCommentsById(id);
    }
}
