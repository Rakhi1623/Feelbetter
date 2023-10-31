package com.canddella.FeelBetter.controller;

import com.canddella.FeelBetter.entity.Meditation;
import com.canddella.FeelBetter.repositary.MeditationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private MeditationRepository meditationRepository;

    @GetMapping("/home")
    public String homeCustomers(Model theModel) {


        return "home";
    }
    
    
    @GetMapping("/home/meditation")
    public String meditation(Model theModel) {
        List<Meditation> meditations = meditationRepository.findAll();
        theModel.addAttribute("meditations", meditations);
        return "meditation";
    }
	
	 @GetMapping("home/home")
	 public String homeCustomer(Model theModel) {
	
	  return "home";
	  }
	 
		/*
		 * @GetMapping("home/home/meditation") public String homeCustome(Model theModel)
		 * { List<Meditation> meditations = meditationRepository.findAll();
		 * theModel.addAttribute("meditations", meditations); return "meditation"; }
		 */
   /* @GetMapping("/stage")
    public String stages(Model theModel) {


        return "stage";

    }*/

}