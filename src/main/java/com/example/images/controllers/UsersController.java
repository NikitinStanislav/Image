package com.example.images.controllers;


import com.example.images.domain.User;
import com.example.images.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UsersController {


    /**имей ввиду, что с его помощью будем вызвать crud методы(если правильно понял, то примерно то, что мы в дао делалил)*/
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String getMainPage(Model model){
        Iterable<User> users =  userRepository.findAll();
        model.addAttribute("users", users);
        return "/users/mainPage";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") int id, Model model){

        model.addAttribute("user", userRepository.findById(id));
        return "/users/userPage";
    }

    @PostMapping
    public String createUser(@ModelAttribute("postedUser") User user){
        userRepository.save(user);
        return "redirect:/users";
    }

    @GetMapping("/new")
    public String newUser(@ModelAttribute("user") User user){
        return "/users/createUserPage";
    }
}
