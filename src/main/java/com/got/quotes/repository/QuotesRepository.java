package com.got.quotes.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.got.quotes.model.Quote;

public interface QuotesRepository extends MongoRepository<Quote, String> {
	List<Quote> findByQuoteBy(String quoteBy);
}
