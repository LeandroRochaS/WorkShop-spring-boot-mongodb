package com.projeto.workshop.demo.services;

import java.util.List;
import java.util.Optional;

import com.projeto.workshop.demo.dto.UserDTO;
import com.projeto.workshop.demo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.workshop.demo.entities.User;
import com.projeto.workshop.demo.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User user){
        return repository.insert(user);
    }

    public void delete(String id){
        repository.deleteById(id);
    }

    public User update(Optional<User> obj){
        User user = repository.findById(obj.get().getId()).orElseThrow(() -> new RuntimeException("User not found"));
        updateData(obj, user);
        return repository.save(user);
    }

    private void updateData(Optional<User> newObj, User obj) {
        newObj.ifPresent(user -> {
            obj.setName(user.getName());
            obj.setEmail(user.getEmail());
        });
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }


}

