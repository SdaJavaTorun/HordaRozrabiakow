package com.sdajava.Horda.controller;

import com.sdajava.Horda.model.PersonForm;
import com.sdajava.Horda.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private final UserService userService;

    public LoginController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public String getLoginData (PersonForm personForm) {
        logger.info("doszlismy do funckji getLoginData");
        return "page";
    }
}
