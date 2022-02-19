package com.example.QuoteCRUD.service;

import com.example.QuoteCRUD.entity.Quote;
import com.example.QuoteCRUD.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepository repository;

    public Quote saveQuote(Quote quote) {
        return repository.save(quote);
    }

    public List<Quote> saveQuotes(List<Quote> quotes) {
        return repository.saveAll(quotes);
    }

    public List<Quote> getQuotes() {
        return repository.findAll();
    }

    public Quote getQuoteById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Quote getQuoteByName(String title) {
        return repository.findByName(title);
    }

    public String deleteQuote(int id) {
        repository.deleteById(id);
        return "Quote removed !! " + id;
    }

    public Quote updateQuote(Quote quote) {
    	Quote existingQuote = repository.findById(quote.getId()).orElse(null);
        existingQuote.setTitle(quote.getTitle());
        existingQuote.setDesc(quote.getDesc());
 
        return repository.save(existingQuote);
    }


}