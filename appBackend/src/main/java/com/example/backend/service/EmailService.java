package com.example.backend.service;

import com.example.backend.model.Nonprofit;
import com.example.backend.model.SentEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmailService {

    private final List<SentEmail> sentEmails = new ArrayList<>();

    public void sendEmailToNonprofits(List<Nonprofit> nonprofits) {
        String subject = "Sending money to nonprofits";
        for (Nonprofit nonprofit : nonprofits) {
            String recipientEmail = nonprofit.getEmail();
            System.out.println("Sending email to " + recipientEmail + ": " + subject);

            SentEmail sentEmail = new SentEmail();
            sentEmail.setRecipientEmail(recipientEmail);
            sentEmail.setSubject(subject);
            sentEmail.setSentDateTime(LocalDateTime.now());
            sentEmails.add(sentEmail);
        }
    }

    public List<SentEmail> getAllSentEmails() {
        return sentEmails;
    }
}