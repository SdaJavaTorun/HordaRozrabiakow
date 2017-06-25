package com.sdajava.Horda.controller;

import com.sdajava.Horda.model.PersonForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    UserDetailsService userDetailsService;

    @PostMapping("/login")
    public String publicPage(PersonForm personForm) {
        logger.info("Odwiedzono publiczny endpoint");
        UserDetails userDetails = userDetailsService.loadUserByUsername(personForm.getFirstName());
        logger.info("Zaladowalem usera: " + userDetails.getUsername());
        return "page";
    }
}
