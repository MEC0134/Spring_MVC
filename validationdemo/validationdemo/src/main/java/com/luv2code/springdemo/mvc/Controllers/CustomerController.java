package com.luv2code.springdemo.mvc.Controllers;

import com.luv2code.springdemo.mvc.Model.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    // add an initbinder to convert trim input strings
    @InitBinder
    public void InitBinder(WebDataBinder dataBinder) {

        // removes leading and trailing white spaces, true will trim to null if all white
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        // applying stringTrimmerEditor for every String class
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);

    }

    @GetMapping("/customerForm")
    public String customerForm(Model theModel) {

        theModel.addAttribute("customer", new Customer());

        return  "customer-form";
    }

    @PostMapping("/processForm")
    public String processForm( // will look at customer object for validation rules
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult) {

        System.out.println("Binding Result - " + theBindingResult.toString());

        if(theBindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }



}
