package com.canddella.FeelBetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.canddella.FeelBetter.entity.Exercises;
import com.canddella.FeelBetter.repositary.ExercisesRepository;

@Controller
public class ExercisesController {
	@Autowired
    private ExercisesRepository exercisesRepository;
	
	

    @GetMapping("/home/exercises")
    public String Exercises(Model theModel) {
        List<Exercises> exercises = exercisesRepository.findAll();
        theModel.addAttribute("exercises", exercises);
        return "exercises";
    }
	
    @GetMapping("home/home/exercises")
	 public String homeCustome(Model theModel) {
    	List<Exercises> exercises = exercisesRepository.findAll();
        theModel.addAttribute("exercises", exercises);
	  return "exercises"; }
	
}
