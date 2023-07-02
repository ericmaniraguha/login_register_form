package com.resgister_login.demo.service;


import java.util.List;

import com.resgister_login.demo.dto.UserDto;
import com.resgister_login.demo.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}