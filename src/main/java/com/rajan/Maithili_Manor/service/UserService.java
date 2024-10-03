package com.rajan.Maithili_Manor.service;

import com.rajan.Maithili_Manor.entity.User;

import java.util.List;

public interface UserService {

    void registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);

    void registerAdmin(User user);
}
