package com.luv2code.springdemo.mvc.Controllers;

import com.luv2code.springdemo.mvc.Model.Customer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @GetMapping("/customerForm")
    public String customerForm(Model theModel) {

        theModel.addAttribute("customer", new Customer());

        return  "customer-form";
    }

    @PostMapping("/processForm")
    public String processForm( // will look at customer object for validation rules
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult) {

        if(theBindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }

    }

}
