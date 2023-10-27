package com.example.backendsw2.usecase.user;

import com.example.backendsw2.adapter.repository.UserRepository;
import com.example.backendsw2.domain.dto.UserDto;
import com.example.backendsw2.domain.entities.User;
import com.example.backendsw2.domain.mapper.UserMapper;

import java.util.List;
import java.util.Optional;

public class ConsultUserUseCase {

    private UserRepository userRepository;
    private User user;

    public ConsultUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> execute() {
        List<User> users = userRepository.findAll();
        List<UserDto> listUsers = UserMapper.INSTANCE.toDto(users);

        return listUsers;
    }
    public List<UserDto> executeTwo(String name, String password) {
        List<User> users = userRepository.findUserByNameAndPassword (name, password);
        List<UserDto> listUsers = UserMapper.INSTANCE.toDto(users);
        return listUsers;
    }
}