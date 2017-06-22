package com.sdajava.Horda.controller;

import com.sdajava.Horda.model.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by user on 2017-06-19.
 */

@Controller
@RequestMapping (value = "/register")
public class RegisterController {

    @GetMapping
    public String showForm(PersonForm personForm) {
        return "register";
    }

//    @PostMapping
//    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {
//        System.out.println("rejestruję");
//        System.out.println(personForm.toString());
//        if (bindingResult.hasErrors()) {
//            System.out.println("rejestruję, błąd");
//            return "register";
//        }
//        return "redirect:/horda";
//
//
//    }

    @PostMapping
    public String checkPersonInfo(PersonForm personForm) {
        System.out.println("rejestruję");
        System.out.println(personForm.toString());

        return "redirect:/main";


    }
}
