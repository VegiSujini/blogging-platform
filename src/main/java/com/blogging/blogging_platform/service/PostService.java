package com.blogging.blogging_platform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogging.blogging_platform.entity.Post;
import com.blogging.blogging_platform.repository.PostRepository;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    
    public Post savePost(Post post){
        return postRepository.save(post);
    }

    public List<Post> getPost(){
        return postRepository.findAll();
    }

    public Post getPostById(Long id){
        return postRepository.findById(id).get();
    }

    public Post updatePostById(Post post){
        Post findPost = postRepository.findById(post.getId()).get();
        findPost.setTitle(post.getTitle());
        findPost.setContent(post.getContent());
        findPost.setAuthor(post.getAuthor());
        findPost.setComments(post.getComments());
        return postRepository.save(findPost);
    }

    public void deletePostById(Long id){
        postRepository.deleteById(id);
    }


}
