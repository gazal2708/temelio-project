package com.example.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.model.NonProfit;
import com.example.backend.repository.NonProfitRepository;

@Service
public class NonProfitService {
    @Autowired
    private NonProfitRepository nonProfitRepository;

    public void createNonprofit(NonProfit nonprofit) {
        nonProfitRepository.save(nonprofit);

    }

}
