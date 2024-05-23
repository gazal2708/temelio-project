package com.example.backend.controller;

import com.example.backend.service.EmailService;
import com.example.backend.service.NonProfitService;
import com.example.backend.model.NonProfit;
import com.example.backend.repository.NonProfitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/nonprofits")
public class NonProfitController {
    @Autowired
    private NonProfitRepository nonprofitRepository;

    @Autowired
    private EmailService emailService;

    @Autowired
    private NonProfitService nonProfitService;

    @GetMapping
    public List<NonProfit> getAllNonprofits() {
        return nonprofitRepository.findAll();
    }

    @PostMapping(value = "")
    public void createNonprofit(@RequestBody NonProfit nonprofit) {
        nonProfitService.createNonprofit(nonprofit);
    }

    @PostMapping("/send-email")
    public void sendEmailToNonprofits(@RequestBody List<NonProfit> nonprofits) {
        emailService.sendEmailToNonprofits(nonprofits);
    }
}
