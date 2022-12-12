package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BookLoan;

public interface BookLoanRepository  extends JpaRepository<BookLoan, Long> {
	
}
