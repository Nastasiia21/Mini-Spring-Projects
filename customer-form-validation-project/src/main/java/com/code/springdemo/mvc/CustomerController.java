package com.code.springdemo.mvc;

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

// Marks this class as a Controller in the Spring MVC framework
@Controller
public class CustomerController {

    // Method to customize the binding process; it's called for every web request coming into the controller
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        // Creates a StringTrimmerEditor to trim strings; if the only characters are whitespace,
        // it will trim it down to null. This helps in removing leading and trailing whitespace.
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        // Registers the StringTrimmerEditor as a custom editor for String class objects.
        // This ensures that all String objects are trimmed as per the StringTrimmerEditor's configuration.
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    // Handler method to display the initial form to the user
    // Responds to GET requests on the root ("/") path
    @GetMapping("/")
    public String showForm(Model theModel){
        // Adds a new Customer object to the model to hold form data
        theModel.addAttribute("customer", new Customer());

        // Returns the name of the view to show the form to the user
        return "customer-form";
    }

    // Handler method to process the submitted form
    // Responds to POST requests on the "/processForm" path
    @PostMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer theCustomer, // Validates the Customer object
            BindingResult theBindingResult){ // Holds the result of the validation and binding
        // Checks if there were any validation errors
        if(theBindingResult.hasErrors()){
            // If there are errors, it returns back to the form view
            return "customer-form";
        }else{
            // If there are no errors, it redirects to the confirmation view
            return "customer-confirmation";
        }
    }
}

