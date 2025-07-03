package com.ms.user.controller;

import com.ms.user.enitity.User;
import com.ms.user.service.Userservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private Userservice userservice;

    public UserController(Userservice userservice) {
        this.userservice = userservice;
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userservice.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userservice.getUserById(id);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userservice.getAllUsers();
    }

    //delte bu id
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Integer id) {
        userservice.deleteUserById(id);
    }

}

