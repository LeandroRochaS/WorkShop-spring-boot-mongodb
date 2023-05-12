package com.projeto.workshop.demo.services;

import com.projeto.workshop.demo.entities.Post;
import com.projeto.workshop.demo.repositories.PostRepository;
import com.projeto.workshop.demo.repositories.PostRepository;
import com.projeto.workshop.demo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;


    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}

