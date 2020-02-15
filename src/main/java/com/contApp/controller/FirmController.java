package com.contApp.controller;

import com.contApp.repository.FirmRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class FirmController {
    private FirmRepository firmRepository;

    public FirmController(FirmRepository firmRepository) {
        this.firmRepository = firmRepository;
    }
    @GetMapping("/firm")
    public String getFirm(Model model) {  //return a string of the viewname called "firm"

        model.addAttribute("firm", firmRepository.findAll()); //take the model, add atribute "firm"

        return "firm";}
}

