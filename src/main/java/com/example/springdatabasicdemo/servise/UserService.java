package com.example.springdatabasicdemo.servise;

import com.example.springdatabasicdemo.dtos.UserDto;
import com.example.springdatabasicdemo.models.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long id);

    List<UserDto> getAllUsers();

    void deleteUser(Long id);
}
