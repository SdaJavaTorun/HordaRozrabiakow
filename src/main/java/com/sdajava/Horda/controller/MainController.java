package com.sdajava.Horda.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
import java.util.logging.Logger;

@Controller
public class MainController {

    //private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    //@GetMapping({"/public", "/"})
    @GetMapping("/")
    public String publicPage(Map<String, Object> model) {
        //logger.info("Odwiedzono publiczny endpoint");
        model.put("text", "A PUBLIC PAGE!");
        return "main";
    }
}
