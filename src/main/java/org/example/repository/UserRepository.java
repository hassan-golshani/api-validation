package org.example.repository;

import org.example.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//This is an in-memory repository
@Component
public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public User save(User user) {
        user.setId(users.size() + 1);
        users.add(user);
        return user;
    }

    public boolean existByEmail(String email) {
        return users
                .stream()
                .anyMatch(user -> user.getEmail().equalsIgnoreCase(email));
    }
}