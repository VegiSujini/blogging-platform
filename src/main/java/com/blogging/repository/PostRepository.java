package com.blogging.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogging.blogging_platform.entity.Post;

public interface PostRepository extends JpaRepository<Post,Long>{
    
}
