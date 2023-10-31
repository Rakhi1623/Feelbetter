package com.canddella.FeelBetter.controller;

import com.canddella.FeelBetter.dto.UserAnswerDto;
import com.canddella.FeelBetter.entity.Customer;
import com.canddella.FeelBetter.entity.User;
import com.canddella.FeelBetter.service.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("customer")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/demo")
    public String registrationCustomers(Model theModel) {


        return "demo";

    }

    @GetMapping("/login")
    public String loginCustomers(Model theModel) {


        return "login";
    }








    /*@PostMapping ("/loginsubmit")
    public String loginSubmit(@RequestParam String username, @RequestParam String password, Model model) {

        if (loginService.login(username, password)) {
           User user = loginService.findUserByName(username);
           model.addAttribute("customer", user.getCustomer());

            return "stage";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";

        }

    }*/
    @PostMapping("/loginsubmit")
    public String loginSubmit(@RequestParam String username, @RequestParam String password, Model model) {

        if (loginService.login(username, password)) {
            User user = loginService.findUserByName(username);
            model.addAttribute("customer", user.getCustomer());

            return "stage";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }

}
