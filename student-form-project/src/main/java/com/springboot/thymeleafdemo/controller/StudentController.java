package com.springboot.thymeleafdemo.controller;

import com.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

// Annotate this class as a Controller to participate in Spring MVC's controller mechanism.
@Controller
public class StudentController {

    // Inject the list of countries from the application.properties file.
    @Value("${countries}")
    private List<String> countries;

    // Inject the list of languages from the application.properties file.
    @Value("${languages}")
    private List<String> languages;

    // Inject the list of systems from the application.properties file.
    @Value("${systems}")
    private List<String> systems;

    // Define a method to show the student form when a GET request is made to "/showStudentForm".
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){
        // Create a new Student object.
        Student theStudent = new Student();

        // Add the Student object to the model under the name "student".
        // This makes it accessible in the view (student-form.html).
        theModel.addAttribute("student", theStudent);

        // Add the list of countries to the model, making it accessible in the view.
        theModel.addAttribute("countries", countries);

        // Add the list of languages to the model, making it accessible in the view.
        theModel.addAttribute("languages", languages);

        // Add the list of systems to the model, making it accessible in the view.
        theModel.addAttribute("systems", systems);

        // Return the name of the view to be rendered, in this case "student-form.html".
        return "student-form";
    }

    // Define a method to process the form submission when a POST request is made to "/processStudentForm".
    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
        // Log the received Student object's first name and last name to the console.
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());

        // Return the name of the view to be rendered after processing the form, in this case "student-confirmation.html".
        return "student-confirmation";
    }

}
