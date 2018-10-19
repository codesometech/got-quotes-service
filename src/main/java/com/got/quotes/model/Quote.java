package com.got.quotes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection="quotes")
public class Quote {
	@JsonIgnore
	@Id
	private String id;
	private String text;
	private String quoteBy;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getQuoteBy() {
		return quoteBy;
	}
	public void setQuoteBy(String quoteBy) {
		this.quoteBy = quoteBy;
	}
}
