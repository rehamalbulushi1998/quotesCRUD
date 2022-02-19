package com.example.QuoteCRUD.repository;


import com.example.QuoteCRUD.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote,Integer> {
    Quote findByName(String title);
}