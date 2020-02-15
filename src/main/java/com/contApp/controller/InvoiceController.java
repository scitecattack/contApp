package com.contApp.controller;

import com.contApp.repository.InvoiceRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class InvoiceController {
    private InvoiceRepository invoiceRepository;

    public InvoiceController(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @GetMapping("/invoice")
    public String getInvoice(Model model) {  //return a string of the viewname called "invoice"

        model.addAttribute("invoice", invoiceRepository.findAll()); //take the model, add atribute "invoice"

        return "invoice";}
}

