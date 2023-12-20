package com.luv2code.springdemo.mvc.Model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {

    @NotNull()
    @Size(min = 2, message = "Field is required and min length must be 2 characters!")
    private String firstName;

    @NotNull()
    @Size(min = 2, message = "Field is required and min length must be 2 characters!")
    private String lastName;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
