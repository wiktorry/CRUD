package com.example.crud.services;

import com.example.crud.entity.Car;
import com.example.crud.entity.User;

import java.util.List;

public interface UsersService {
    List<User> findAll();
    User findById(int Id);
    User create(User user);
    User update(User user);
    void deleteById(int Id);
}
