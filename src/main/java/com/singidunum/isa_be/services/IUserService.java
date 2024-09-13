package com.singidunum.isa_be.services;

import com.singidunum.isa_be.entities.User;

import java.util.List;

public interface IUserService {
    void addUser(User user);

    List<User> getUsers();

    User getUser(Integer id);

    void updateUser(Integer id, User user);

    void deleteUser(Integer id);
}
