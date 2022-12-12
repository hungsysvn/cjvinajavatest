package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.BookLoan;

public interface BookLoanService {

	public List<BookLoan> findAll();
	
	public Optional<BookLoan> findById(long id);

	public void delete(long id);
	
	public void save(BookLoan bookLoan);
}
