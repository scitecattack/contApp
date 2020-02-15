package com.contApp.controller;

import com.contApp.repository.PaymentRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class PaymentController {

    private PaymentRepository paymentRepository;

    public PaymentController(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @GetMapping("/payment")
    public String getPayment(Model model) {  //return a string of the viewname called "payment"

        model.addAttribute("payment", paymentRepository.findAll()); //take the model, add atribute "payment"

        return "payment";}
}

