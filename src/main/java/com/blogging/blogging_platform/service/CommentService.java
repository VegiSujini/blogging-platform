package com.blogging.blogging_platform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogging.blogging_platform.entity.Comment;
import com.blogging.blogging_platform.repository.CommentRepository;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public Comment getCommentsById(Long id) {
        return commentRepository.findById(id).get();
    }
}
