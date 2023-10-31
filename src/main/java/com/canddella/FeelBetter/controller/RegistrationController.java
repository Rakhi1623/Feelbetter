package com.canddella.FeelBetter.controller;


import com.canddella.FeelBetter.dto.RegistrationDto;
import com.canddella.FeelBetter.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;
    @GetMapping("/signup")
    public String signupCustomers(Model theModel) {


        return "registration";

    }
    @PostMapping("/registrationsubmitt")
    public String processRegistration(@ModelAttribute("registrationDto") RegistrationDto registrationDto,Model model) {

        registrationService.register(registrationDto);

        return "login";
    }

}
