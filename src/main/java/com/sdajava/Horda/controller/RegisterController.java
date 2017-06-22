package com.sdajava.Horda.controller;

import com.sdajava.Horda.dto.UserDto;
import com.sdajava.Horda.model.User;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

public class RegisterController {

    /*@GetMapping({"/register", "/"})
    public String publicPage(Map<String, Object> model) {
        model.put("text", "Zarejestruj się!");
        return "page";
    }*/
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String showRegisterForm (WebRequest webRequest, Model model){
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "main";
    }

    /*@RequestMapping(value = "/user/registration", method = RequestMethod.POST)
    public ModelAndView registerUserAccount
            (@ModelAttribute("user") @Valid UserDto accountDto,
             BindingResult result, WebRequest request, Errors errors) {
        User registered = new User();
        if (!result.hasErrors()) {
            registered = createUserAccount(accountDto, result);
        }
        if (registered == null) {
            result.rejectValue("email", "message.regError");
        }
        // rest of the implementation
        return registered;
    }

    private User createUserAccount(UserDto accountDto, BindingResult result) {
        User registered = null;
        try {
            registered = service.registerNewUserAccount(accountDto);
        } catch (EmailExistsException e) {
            return null;
        }
        return registered;
    }*/
}
