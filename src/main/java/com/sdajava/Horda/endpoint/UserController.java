//package com.sdajava.Horda.endpoint;
//
//import com.sdajava.Horda.dto.UserDto;
//import com.sdajava.Horda.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//@Controller
//@RequestMapping("/register")
//public class UserController {
//
//    @Autowired
//    private final UserService userService;
//
//    public UserController (UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping()
//    public String addUser(@ModelAttribute UserDto userDto,
//                          RedirectAttributes redirectAttributes) {
//        userService.addUser(userDto.fromDto());
//        redirectAttributes.addFlashAttribute("result", "User została dodana.");
//        return "redirect:/main";
//    }
//}
