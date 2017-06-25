//package com.sdajava.Horda.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.util.Map;
//
//@Controller
//public class MainController {
//
//    private static final Logger logger = LoggerFactory.getLogger(MainController.class);
//
//    //@GetMapping({"/public", "/"})
//    @GetMapping
//    public String publicPage(Map<String, Object> model) {
//        //logger.info("Odwiedzono publiczny endpoint");
//        model.put("text", "A PUBLIC PAGE!");
//        return "main";
//    }
//
//
//    @PostMapping
//    public String logIn(Map<String, Object> model) {
//        System.out.println("zalogowałem sie");
//        model.put("text", "LogIN");
//
//        return "login";
//
//
//    }
//
//}
