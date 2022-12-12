package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.BookLoan;
import com.example.demo.service.BookLoanService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BookLoanController {

	@Autowired
	private BookLoanService bookLoanService;
	
	@RequestMapping("/addnew")
    public String showAddForm(BookLoan bookLoan) {
        return "redirect:/add-bookloan";
    }
	
	@RequestMapping(value = "/add-bookloan", method = RequestMethod.GET)
	public String add() {
		return "add-bookloan";
	}
	
	@RequestMapping(value = "/add-bookloan", method = RequestMethod.POST)
	public String addbookloan() {
		return "thuesach";
	}

	@RequestMapping(value = "/bookloans", method = RequestMethod.GET)
	public String shows(ModelMap model) {
		try {
			List<BookLoan> bookLoans = new ArrayList<BookLoan>();
			bookLoans = bookLoanService.findAll();
			model.put("list", bookLoans);
		} catch (Exception e) {
			log.error(e.getStackTrace().toString());
		}

		return "thuesach";
	}

	@RequestMapping(value = "/bookloans", method = RequestMethod.POST)
	public String addBookLoan(@ModelAttribute("bookLoan") BookLoan bookLoan, Model model) {
		try {
			bookLoanService.save(bookLoan);
		} catch (Exception e) {
			log.error(e.getStackTrace().toString());
		}

		return "redirect:/bookloans";
	}

	@RequestMapping("/delete/{id}")
	public String deleteBookLoan(@PathVariable("id") long id, Model model) {

		try {
			bookLoanService.delete(id);
		} catch (Exception e) {
			log.error(e.getStackTrace().toString());
		}

		return "redirect:/bookloans";
	}
}
