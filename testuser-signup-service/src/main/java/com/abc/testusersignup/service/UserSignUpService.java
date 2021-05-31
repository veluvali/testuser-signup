package com.abc.testusersignup.service;

import java.util.UUID;
import com.abc.models.User;


public interface UserSignUpService {
    String createUser(User user);

    User findUserById(String id);
}
