package com.luv2code.springboot.thymeleafdemo.Controller;

import com.luv2code.springboot.thymeleafdemo.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showStudForm(Model theModel) {

        // create a student object
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }


    @PostMapping("/processStudentForm")
    public String processStudForm(@ModelAttribute("student") Student theStudent) {

        // log form data
        System.out.printf("theStudent: " + theStudent);


        return "student-confirmation";
    }

}
