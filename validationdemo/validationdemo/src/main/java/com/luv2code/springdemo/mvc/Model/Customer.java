package com.luv2code.springdemo.mvc.Model;

import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "Field Required")
    @Size(min = 2, message = "Field is required and min length must be 2 characters!")
    private String lastName;

    @NotNull(message = "Field Required")
    @Min(value = 0, message = "must be greater than or equal to 0")
    @Max(value = 10, message = "must be less than or equal to 10")
    private Integer itemAmount;

    @Pattern(regexp = "[a-zA-Z0-9]{6}", message = "Only 6 chars/digits")
    private String postalCode;



    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(Integer itemAmount) {
        this.itemAmount = itemAmount;
    }

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
