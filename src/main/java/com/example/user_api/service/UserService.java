package com.example.user_api.service;

import com.example.user_api.model.User;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(@Valid User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    User updateUser(Long id,@Valid User userDetails);
    void deleteUser(Long id);

}
