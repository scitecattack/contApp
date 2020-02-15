package com.contApp.controller;

import com.contApp.repository.SupplierRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class SupplierController {
    private SupplierRepository supplierRepository;

    public SupplierController(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @GetMapping("/supplier")
    public String getSupplier(Model model) {  //return a string of the viewname called "supplier"

        model.addAttribute("supplier", supplierRepository.findAll()); //take the model, add atribute "supplier"

        return "supplier";}
}

