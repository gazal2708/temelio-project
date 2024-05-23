package com.example.backend.controller;

import com.example.backend.model.SentEmail;
import com.example.backend.repository.SentEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sent-emails")
public class SentEmailController {
    @Autowired
    private SentEmailRepository sentEmailRepository;

    @GetMapping
    public List<SentEmail> getAllSentEmails() {
        return sentEmailRepository.findAll();
    }
}
