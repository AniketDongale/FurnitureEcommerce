package com.shoping.service;

import com.shoping.Entity.User;
import com.shoping.Entity.UserDto;
import com.shoping.Entity.UserInfo;

import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);

    List<User> getAllUsers();

    User getUserById(long id);


    void deleteUser(long id);

    UserInfo getUserByName(String username);
}
