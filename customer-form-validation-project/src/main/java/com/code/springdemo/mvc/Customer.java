package com.code.springdemo.mvc;

import com.code.springdemo.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;

// Defines a Customer class to store customer-related information
public class Customer {

    // Stores the first name of the customer
    private String firstName;

    // Stores the last name of the customer; it must not be null and must have at least 1 character
    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String lastName;

    // Stores the number of free passes a customer has; it must be between 0 and 10 inclusive
    @NotNull(message = "is required")
    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 10, message = "must be less than or equal to 10")
    private Integer freePasses;

    // Stores the postal code of the customer; it must match the specified pattern of 5 alphanumeric characters
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 digits/chars")
    private String postalCode;

    // Stores the course code of the customer; with the help of custom validation
    @CourseCode
    private String courseCode;

    // Returns the first name of the customer
    public String getFirstName() {
        return firstName;
    }

    // Sets the first name of the customer
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Returns the last name of the customer
    public String getLastName() {
        return lastName;
    }

    // Sets the last name of the customer, ensuring it meets the validation constraints
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Returns the number of free passes the customer has
    public Integer getFreePasses() {
        return freePasses;
    }

    // Sets the number of free passes for the customer, ensuring it falls within the valid range
    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    // Returns the postal code of the customer
    public String getPostalCode() {
        return postalCode;
    }

    // Sets the postal code of the customer, ensuring it matches the specified pattern
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
