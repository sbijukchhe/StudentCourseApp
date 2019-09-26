package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(){
        return "home";
    }

    @RequestMapping("/class")
    public String classpage(){
        return "class";
    }

    @RequestMapping("/student")
    public String studentpage(){
        return "student";
    }

    @RequestMapping("/transcript")
    public String transcriptpage(){
        return "transcript";
    }

}
