package com.example.backend.service;

import com.example.backend.model.NonProfit;
import com.example.backend.model.SentEmail;
import com.example.backend.repository.SentEmailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmailService {

    @Autowired
    private SentEmailRepository sentEmailRepository;

    public void sendEmailToNonprofits(List<NonProfit> nonprofits) {
        String subject = "Sending money to nonprofit organisation: ";
        for (NonProfit nonprofit : nonprofits) {
            String recipientEmail = nonprofit.getEmail();
            String recipientName = nonprofit.getName();
            System.out.println("Sending email to " + recipientEmail + ": " + subject + recipientName);

            SentEmail sentEmail = new SentEmail();
            sentEmail.setRecipientEmail(recipientEmail);
            sentEmail.setSubject(subject);
            sentEmail.setSentDateTime(LocalDateTime.now());
            sentEmailRepository.save(sentEmail);
        }
    }
}