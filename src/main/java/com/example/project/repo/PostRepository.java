package com.example.project.repo;

import org.springframework.data.repository.CrudRepository;
import com.example.project.models.Post;

public interface PostRepository extends CrudRepository <Post, Long>{
    
    
}
