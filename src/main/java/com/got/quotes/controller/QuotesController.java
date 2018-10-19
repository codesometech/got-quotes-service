package com.got.quotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.got.quotes.model.Quote;
import com.got.quotes.repository.QuotesRepository;

@RestController
public class QuotesController {
	
	@Autowired
	private QuotesRepository quotesRepository;
	
	@GetMapping(path="/quotes")
	public List<Quote> getAllQuotes() {
		return quotesRepository.findAll();
	}
	
	@GetMapping(path="/quotes/{user}")
	public List<Quote> getAllQuotesByUser(@PathVariable String user) {
		return quotesRepository.findByQuoteBy(user);
	}
	
	@PostMapping(path="/quotes", consumes="application/json")
	public void saveQuote(@RequestBody Quote quote) {
		quotesRepository.save(quote);
	}
	
}
