package com.springboot.thymeleafdemo.model;

import java.util.List;

// The Student class represents a model in the MVC pattern and will be used to hold student data.
public class Student {
    // Fields to store the student's first name, last name, country, favorite programming language,
    // and a list of favorite systems.
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private List<String> favoriteSystems;

    // Default constructor. It's needed for Spring to instantiate objects of this class.
    public Student() {
    }

    // Getter for the student's first name.
    // Returns the first name of the student.
    public String getFirstName() {
        return firstName;
    }

    // Setter for the student's first name.
    // Parameter firstName is the first name to set for this student.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for the student's last name.
    // Returns the last name of the student.
    public String getLastName() {
        return lastName;
    }

    // Setter for the student's last name.
    // Parameter lastName is the last name to set for this student.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for the student's country.
    // Returns the country of the student.
    public String getCountry() {
        return country;
    }

    // Setter for the student's country.
    // Parameter country is the country to set for this student.
    public void setCountry(String country) {
        this.country = country;
    }

    // Getter for the student's favorite programming language.
    // Returns the favorite programming language of the student.
    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    // Setter for the student's favorite programming language.
    // Parameter favoriteLanguage is the programming language to set as favorite for this student.
    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    // Getter for the list of the student's favorite systems.
    // Returns the list of favorite systems of the student.
    public List<String> getFavoriteSystems() {
        return favoriteSystems;
    }

    // Setter for the list of the student's favorite systems.
    // Parameter favoriteSystems is the list of systems to set as favorite for this student.
    public void setFavoriteSystems(List<String> favoriteSystems) {
        this.favoriteSystems = favoriteSystems;
    }
}
