package com.abc.testusersignup.controller;

import java.util.UUID;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.abc.api.V1Api;
import com.abc.models.User;
import com.abc.testusersignup.service.UserSignUpService;


@RestController
public class UserSignUpController implements V1Api {

    private UserSignUpService userSignUpService;

    public UserSignUpController(UserSignUpService userSignUpService){
        this.userSignUpService = userSignUpService;
    }

    @Override
    public ResponseEntity<String> signUpNewUser(@Valid final User user) {
        System.out.println(user.getFirstName());
        return new ResponseEntity<String>(userSignUpService.createUser(user),  HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<User> getUserById(final String id){
        User user = userSignUpService.findUserById(id.trim());
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }
}
