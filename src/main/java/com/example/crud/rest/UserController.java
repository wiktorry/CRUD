package com.example.crud.rest;

import com.example.crud.entity.User;
import com.example.crud.services.UsersServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private UsersServiceImpl usersService;
    public UserController(UsersServiceImpl usersService){
        this.usersService = usersService;
    }
    @GetMapping
    private List<User> getAll(){
        return usersService.findAll();
    }
    @GetMapping("/{userId}")
    private User getUserById(@PathVariable int userId){
        return usersService.findById(userId);
    }
    @PostMapping
    private User addUser(@RequestBody @Valid User user){
        user.setId(0);
        return usersService.create(user);
    }
    @PutMapping
    private User updateUser(@RequestBody @Valid User user){
        return usersService.update(user);
    }
    @DeleteMapping("/{userId}")
    private void deleteUser(@PathVariable int userId){
        usersService.deleteById(userId);
    }
}
