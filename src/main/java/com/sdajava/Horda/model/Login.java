package com.sdajava.Horda.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by RENT on 2017-06-14.
 */

@Controller
public class Login {

    @GetMapping({"/", "/"})
    public String publicPage(Map<String, Object> model) {
        model.put("text", "Welcome on our page");
        return "page";
    }
}
