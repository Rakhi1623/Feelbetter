package com.canddella.FeelBetter.controller;

import com.canddella.FeelBetter.entity.DoNothingMeditation;
import com.canddella.FeelBetter.entity.MantraMeditation;
import com.canddella.FeelBetter.entity.MindfullnessMeditation;
import com.canddella.FeelBetter.entity.WalkingMeditation;
import com.canddella.FeelBetter.repositary.DoNothingMeditationRepository;
import com.canddella.FeelBetter.repositary.MantraMeditationRepository;
import com.canddella.FeelBetter.repositary.MindfullnessMeditationRepository;
import com.canddella.FeelBetter.repositary.WalkingMeditationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MeditationController {
    @Autowired
    private MindfullnessMeditationRepository mindfullnessMeditationRepositary;
    @Autowired
    private WalkingMeditationRepository walkingMeditationRepository;
    @Autowired
    private MantraMeditationRepository mantraMeditationRepository;

    @Autowired
    private DoNothingMeditationRepository doNothingMeditationRepository;
    @GetMapping("home/meditation/mindfull") // Corrected URL mapping
    public String mindFull(Model theModel) {
        List<MindfullnessMeditation> mindfullnessMeditations = mindfullnessMeditationRepositary.findAll();
        theModel.addAttribute("mindfullnessmeditation", mindfullnessMeditations);
        return "mindfullness";
    }
    @GetMapping("home/meditation/walking") // Corrected URL mapping
    public String walking(Model theModel) {
        List<WalkingMeditation> walkingMeditation = walkingMeditationRepository.findAll();
        theModel.addAttribute("walkingnessmeditation", walkingMeditation);
        return "walking";
    }
    @GetMapping("home/meditation/mantra") // Corrected URL mapping
    public String mantra(Model theModel) {
        List<MantraMeditation> mantraMeditations = mantraMeditationRepository.findAll();
        theModel.addAttribute("mantraMeditations", mantraMeditations);
        return "mantra";
    }
    @GetMapping("home/meditation/donothing") // Corrected URL mapping
    public String donothing(Model theModel) {
        List<DoNothingMeditation> doNothingMeditations = doNothingMeditationRepository.findAll();
        theModel.addAttribute("doNothingMeditations", doNothingMeditations);
        return "donothing";
    }
}
