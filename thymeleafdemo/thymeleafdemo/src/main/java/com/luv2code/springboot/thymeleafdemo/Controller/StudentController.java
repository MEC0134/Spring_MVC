package com.luv2code.springboot.thymeleafdemo.Controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/studentForm")
    public String showStudForm(Model theModel) {
        
    }

}
