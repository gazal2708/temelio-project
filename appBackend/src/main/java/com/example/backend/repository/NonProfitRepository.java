package com.example.backend.repository;

import com.example.backend.model.Nonprofit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NonprofitRepository extends JpaRepository<Nonprofit, String> {
}
