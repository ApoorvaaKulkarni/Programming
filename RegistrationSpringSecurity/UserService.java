package com.example.form.form.service;


import com.example.form.form.dto.UserDto;
import com.example.form.form.model.User;

public interface UserService {

    User findByUsername(String username);
    User save (UserDto userDto);

}