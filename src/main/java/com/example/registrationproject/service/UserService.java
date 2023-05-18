package com.example.registrationproject.service;

import com.example.registrationproject.dto.UserDto;
import com.example.registrationproject.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}