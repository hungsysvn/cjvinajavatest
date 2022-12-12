package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BookLoan;
import com.example.demo.repository.BookLoanRepository;
import com.example.demo.service.BookLoanService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookLoanServiceImpl implements BookLoanService{

	@Autowired
	private BookLoanRepository bookLoanRepository;
	@Override
	public List<BookLoan> findAll() {
		List<BookLoan> bookLoans = new ArrayList<BookLoan>();
		try {
			bookLoans = bookLoanRepository.findAll();
		} catch (Exception e) {
			log.error(e.getStackTrace().toString());
		}
		return bookLoans;
	}
	
	@Override
	public Optional<BookLoan> findById(long id) {
		Optional<BookLoan> bookloan = Optional.ofNullable(new BookLoan());
		try {
			bookloan = bookLoanRepository.findById(id);
		} catch (Exception e) {
			log.error("Invalid bookloan Id:" + id);
		}
		return bookloan;
	}

	@Override
	public void delete(long id) {
		try {
			BookLoan bookloan = bookLoanRepository.findById(id)
				      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
			bookLoanRepository.delete(bookloan);
		} catch (Exception e) {
			log.error(e.getStackTrace().toString());
		}
		
	}

	@Override
	public void save(BookLoan bookLoan) {
		try {
			bookLoanRepository.save(bookLoan);
		} catch (Exception e) {
			log.error(e.getStackTrace().toString());
		}
	}

}
