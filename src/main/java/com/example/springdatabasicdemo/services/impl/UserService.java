package com.example.springdatabasicdemo.services.impl;

import com.example.springdatabasicdemo.dtos.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDTO);

    UserDto getUserById(Long id);

    List<UserDto> getAllUsers();

    UserDto updateUser(Long id, UserDto userDTO);

    boolean deleteUser(Long id);
}
