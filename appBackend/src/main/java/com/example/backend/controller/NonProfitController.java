package com.example.backend.controller;

import com.example.backend.model.Nonprofit;
import com.example.backend.service.EmailService;
import com.example.backend.repository.NonprofitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nonprofits")
public class NonprofitController {
    @Autowired
    private NonprofitRepository nonprofitRepository;

    @Autowired
    private EmailService emailService;

    @GetMapping
    public List<Nonprofit> getAllNonprofits() {
        return nonprofitRepository.findAll();
    }

    @PostMapping
    public void createNonprofit(@RequestBody Nonprofit nonprofit) {
        nonprofitRepository.save(nonprofit);
    }

    @PostMapping("/send-email")
    public void sendEmailToNonprofits(@RequestBody List<Nonprofit> nonprofits) {
        emailService.sendEmailToNonprofits(nonprofits);
    }
}
