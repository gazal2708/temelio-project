package com.example.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.model.NonProfit;

public interface NonProfitRepository extends JpaRepository<NonProfit, String> {
}
