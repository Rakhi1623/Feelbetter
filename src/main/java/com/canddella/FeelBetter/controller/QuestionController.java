package com.canddella.FeelBetter.controller;


import com.canddella.FeelBetter.dto.UserAnswerDto;
import com.canddella.FeelBetter.entity.Answers;
import com.canddella.FeelBetter.entity.Customer;
import com.canddella.FeelBetter.entity.Question;
import com.canddella.FeelBetter.entity.User;
import com.canddella.FeelBetter.repositary.AnswerRepository;
import com.canddella.FeelBetter.repositary.CustomerRepository;
import com.canddella.FeelBetter.repositary.QuestionsRepository;
import com.canddella.FeelBetter.repositary.UserAnswerRepository;
import com.canddella.FeelBetter.service.UserAnswerService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("customer")
public class QuestionController {
    @Autowired
    private QuestionsRepository questionsRepository;
    @Autowired
    private AnswerRepository answerRepository;
    @Autowired
    private UserAnswerRepository userAnswerRepository;

    @Autowired
    private UserAnswerService userAnswerService;
    @Autowired
    private CustomerRepository customerRepository;


    @GetMapping("/questions") // Corrected URL mapping
    public String mindFull(Model theModel) {
    	List<Question> questions = questionsRepository.findAll();
    	theModel.addAttribute("questions", questions);
        List<Answers> answers = answerRepository.findAll();
        theModel.addAttribute("answers", answers);

        return "questions";
    }
    @PostMapping("/questionsubmitt")
    public String respondSubmit(@ModelAttribute("userAnswerDto") UserAnswerDto userAnswerDto, Model model) {
        Customer customer = (Customer) model.getAttribute("customer");
        
		System.out.println("userAnswerDto from respondsubmitt: " + userAnswerDto); 
        
        if (customer != null) {
        	
             // Set the customer's ID in the userAnswerDto
           
             userAnswerService.calculateMood(userAnswerDto,customer);
             
            System.out.println("Customer from respondsubmitt: " + customer);
            return "home";
        } else {
            // Handle the case where "customer" is not found in the session.

            return "stage";
        }

    }


}