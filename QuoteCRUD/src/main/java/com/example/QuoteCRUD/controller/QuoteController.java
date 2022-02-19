package com.example.QuoteCRUD.controller;

import com.example.QuoteCRUD.entity.Quote;
import com.example.QuoteCRUD.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuoteController {

    @Autowired
    private QuoteService service;

    @PostMapping("/addQuote")
    public Quote addQuote(@RequestBody Quote quote) {
        return service.saveQuote(quote);
    }

    @PostMapping("/addQuotes")
    public List<Quote> addQuotes(@RequestBody List<Quote> quotes) {
        return service.saveQuotes(quotes);
    }

    @GetMapping("/quotes")
    public List<Quote> findAllQuotes() {
        return service.getQuotes();
    }

    @GetMapping("/quoteById/{id}")
    public Quote findQuoteById(@PathVariable int id) {
        return service.getQuoteById(id);
    }

    @GetMapping("/quote/{title}")
    public Quote findQuoteByName(@PathVariable String title) {
        return service.getQuoteByName(title);
    }


    @PutMapping("/update")
    public Quote updateQuote(@RequestBody Quote quote) {
        return service.updateQuote(quote);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteQuote(@PathVariable int id) {
        return service.deleteQuote(id);
    }
}