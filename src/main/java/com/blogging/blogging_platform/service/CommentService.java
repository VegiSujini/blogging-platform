package com.blogging.blogging_platform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogging.blogging_platform.entity.Comment;
import com.blogging.blogging_platform.entity.Post;
import com.blogging.blogging_platform.repository.CommentRepository;
import com.blogging.blogging_platform.repository.PostRepository;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private PostRepository postRepository;

    public Comment saveComment(Long postId, Comment comment) {
        Post post = postRepository.findById(postId).get();
        if(post!=null)
        return commentRepository.save(comment);
        else
        return null;
    }

    public List<Comment> getCommentsById(Long id) {
        return postRepository.findById(id).get().getComments();
    }
}
