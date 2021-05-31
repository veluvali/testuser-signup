package com.abc.testusersignup.dao;

import com.abc.models.User;
import com.abc.testusersignup.dto.UserDto;


public interface UserSignUpDao {
    String createUser(UserDto user);
    User findUserById(String id);
}
