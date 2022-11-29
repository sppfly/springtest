package me.liuyi.springtest.controllers;


import jakarta.validation.Valid;
import me.liuyi.springtest.entities.User;
import me.liuyi.springtest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("user")
@RestController
public class UserController {
  
    @Autowired
    private UserRepository userRepository;
    
    
    @PostMapping("create")
    public void createUser(@RequestBody @Valid User user) {
        userRepository.save(user);
    }
    
    @GetMapping("byId")
    public User getUser(@RequestParam Long id) {
        return userRepository.getReferenceById(id);
    }
    
}