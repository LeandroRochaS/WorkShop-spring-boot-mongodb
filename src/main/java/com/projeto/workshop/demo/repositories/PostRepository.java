package com.projeto.workshop.demo.repositories;

import com.projeto.workshop.demo.entities.Post;
import com.projeto.workshop.demo.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
