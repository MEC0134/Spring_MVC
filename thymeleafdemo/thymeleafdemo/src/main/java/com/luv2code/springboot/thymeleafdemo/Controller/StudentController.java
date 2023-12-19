package com.luv2code.springboot.thymeleafdemo.Controller;

import com.luv2code.springboot.thymeleafdemo.Model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @GetMapping("/showStudentForm")
    public String showStudForm(Model theModel) {

        // create a student object
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent);

        // add the list of countries to model
        theModel.addAttribute("countries", countries);

        // add list of languages to model
        theModel.addAttribute("languages", languages);

        return "student-form";
    }


    @PostMapping("/processStudentForm")
    public String processStudForm(@ModelAttribute("student") Student theStudent) {

        // log form data
        System.out.printf("theStudent: " + theStudent);


        return "student-confirmation";
    }

}
