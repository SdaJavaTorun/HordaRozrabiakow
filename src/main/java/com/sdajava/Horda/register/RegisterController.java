package com.sdajava.Horda.register;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by user on 2017-06-19.
 */
public class RegisterController {

    @GetMapping({"/register", "/"})
    public String publicPage(Map<String, Object> model) {
        model.put("text", "Zarejestruj się!");
        return "page";
    }
}
