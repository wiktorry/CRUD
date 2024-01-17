package com.example.crud.services;

import com.example.crud.entity.User;
import com.example.crud.exceptions.CarNotFoundException;
import com.example.crud.exceptions.InvalidCarException;
import com.example.crud.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService{
    private final UserRepository userRepository;
    public UsersServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int Id) {
        return userRepository.findById(Id).orElseThrow(() -> new CarNotFoundException("User doesn't exist in database"));
    }

    @Override
    public User create(User user) {
        Optional<User> exactUser = userRepository.findByEmail(user.getEmail());
        if(exactUser.isPresent()){
            throw new InvalidCarException("User with this email exists");
        }
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void deleteById(int Id) {

    }
}
