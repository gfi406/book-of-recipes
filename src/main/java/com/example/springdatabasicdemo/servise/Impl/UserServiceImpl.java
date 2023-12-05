package com.example.springdatabasicdemo.servise.Impl;

import com.example.springdatabasicdemo.dtos.UserDto;
import com.example.springdatabasicdemo.models.User;
import com.example.springdatabasicdemo.repositories.UserRepository;
import com.example.springdatabasicdemo.servise.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private final ModelMapper modelMapper;
    @Autowired
    public UserServiceImpl(UserRepository userRepository ,ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;

    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow((null) );
                //new ResourceNotFoundException("User not found with id " + id));
    }

    @Override
    public List<UserDto> getAllUsers() {

        return userRepository.findAll().stream().map(e -> modelMapper.map(e, UserDto.class)).collect(Collectors.toList());
    }

    @Override
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}