package com.ms.user.service;

import com.ms.user.enitity.User;
import com.ms.user.repositroy.UserRespoistory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice {

    private UserRespoistory userRespoistory;

    public Userservice(UserRespoistory userRespoistory) {
        this.userRespoistory = userRespoistory;
    }

    public User createUser(User user) {

        User save = userRespoistory.save(user);
        return save;
    }

    public User getUserById(Integer id) {
        return userRespoistory.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        List<User> all = userRespoistory.findAll();
        return all;
    }

    public void deleteUserById(Integer id) {
        userRespoistory.deleteById(id);
    }

}
