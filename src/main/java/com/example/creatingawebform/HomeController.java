package com.example.creatingawebform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String HomePage(){
        return "index";
    }
}
