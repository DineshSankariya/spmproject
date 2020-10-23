package com.Student.StudentProjectManagement.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/log")
    public String login(){
        return "login";
    }

    @RequestMapping("/reg")
    public String registration(){
        return "registration";
    }



}
