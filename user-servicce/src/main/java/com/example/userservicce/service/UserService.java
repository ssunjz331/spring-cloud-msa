package com.example.userservicce.service;

import com.example.userservicce.dto.UserDto;
import com.example.userservicce.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
}
