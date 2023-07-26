package com.soca.webapi.service;


import com.soca.webapi.dao.UserDAO;
import com.soca.webapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    public User saveUser(User user) {
        return userDAO.save(user);
    }

    public User getUserById(int id) {
        return userDAO.findById(id);
    }

    public List<User> getAllUsers() {
        List<User> userList = userDAO.findAll();
        for (User user : userList) {

            System.out.println("Username: " + user.getUsername());

            System.out.println("----------------------");
        }
        System.out.println(userDAO.findAll());
        return userDAO.findAll();
    }

    public void deleteUser(int id) {
        User user = userDAO.findById(id);
        if (user != null) {
            userDAO.delete(user);
        }
    }

}
