package com.luv2code.springboot.thymeleafdemo.Model;


import java.util.List;

public class Student {

    private String fName;
    private String lName;
    private String country;
    private String favoriteLanguage;
    private List<String> favoriteOS;

    public Student() { }

    public Student(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public List<String> getFavoriteOS() {
        return favoriteOS;
    }

    public void setFavoriteOS(List<String> favoriteOS) {
        this.favoriteOS = favoriteOS;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
