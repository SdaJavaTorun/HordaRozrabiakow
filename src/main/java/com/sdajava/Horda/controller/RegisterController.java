package com.sdajava.Horda.controller;

import com.sdajava.Horda.model.PersonForm;
import com.sdajava.Horda.model.User;
import com.sdajava.Horda.repository.UserRepository;
import com.sdajava.Horda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (value = "/register")
public class RegisterController {

    @Autowired
    private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showForm(User user) {
        return "register";
    }

//    @PostMapping
//    public String checkPersonInfo(PersonForm personForm) {
//        System.out.println("rejestruję");
//        System.out.println(personForm.toString());
//
//        return "redirect:/main";
//
//    }

    @PostMapping
    public String createAcount(User user) {
        userService.addUser(new User(user.getLogin(), user.getPassword(), user.getEmail(), User.Role.CANDIDATE));
        System.out.println(user.toString());
        return "redirect:/main";
    }
}
