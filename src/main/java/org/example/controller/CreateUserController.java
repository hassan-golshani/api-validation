package org.example.controller;

import jakarta.validation.Valid;
import org.example.domain.User;
import org.example.model.CreateUserRequest;
import org.example.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateUserController {

    private final UserRepository userRepository;

    public CreateUserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/api/v1/user")
    public User handle(@Valid @RequestBody CreateUserRequest createUserRequest) {
        User user = new User();
        user.setName(createUserRequest.getName());
        user.setSurname(createUserRequest.getSurname());
        user.setEmail(createUserRequest.getEmail());
        user.setAge(createUserRequest.getAge());
        return userRepository.save(user);
    }
}