package com.blogging.blogging_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogging.blogging_platform.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long>{
    
}
