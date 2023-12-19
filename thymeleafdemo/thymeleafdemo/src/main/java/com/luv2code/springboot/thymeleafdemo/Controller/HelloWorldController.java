package com.luv2code.springboot.thymeleafdemo.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }



    // Form input will be sent over here
    @RequestMapping(path="/processForm", method=RequestMethod.POST)
    public String processForm() {
        return "helloworld";
    }


    @RequestMapping("/processFormVersionTwo")
    public String letsShout(HttpServletRequest request, Model theModel) {

        String fName = request.getParameter("studentFName");
        String lName = request.getParameter("studentLName");

        String fullName = fName.toUpperCase() + ' ' +  lName.toUpperCase();

        String output = "Hello " + fullName;

        theModel.addAttribute("message", output);

        return "helloworld";
    }

    @PostMapping("/processFormVersionThree")
    public String letsShout(@RequestParam("studentFName") String fName,
                            @RequestParam("studentLName") String lName, Model theModel) {

        String fullName = fName.toUpperCase() + ' ' +  lName.toUpperCase();

        String output = "Hey my friend from v3! " + fullName;

        theModel.addAttribute("message", output);

        return "helloworld";
    }



}
