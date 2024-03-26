package com.ecomerce.api.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerce.api.demo.models.UserModel;
import com.ecomerce.api.demo.services.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get-all")
    public List<UserModel> getAllUsers(@RequestParam String param) {
        return userService.getAllUsers();
    }
    
    @PostMapping("/save")
    public UserModel save(@RequestBody UserModel entity) {
        return userService.saveUser(entity);
    }
    
    @GetMapping("/{id}")
    public Optional<UserModel> getById(@PathVariable Long id) {
        return userService.getById(id);
    }
    
    @PutMapping("/{id}")
    public UserModel updateById(@PathVariable Long id, @RequestBody UserModel request) {
        return userService.updateById(request, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        return userService.delete(id);
    }
}
