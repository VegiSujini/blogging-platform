package com.blogging.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogging.blogging_platform.entity.Comment;
import com.blogging.repository.CommentRepository;

@Service
public class CommentService{
    @Autowired
    private CommentRepository commentRepository;
     
    public Comment saveComment(Comment comment){
        return commentRepository.save(comment);
    }

    public List<Comment> getComments(){
        return commentRepository.findAll();
    }
}
