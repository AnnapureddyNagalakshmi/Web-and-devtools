package com.web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.web.binding.Book;

@Controller
public class BookController {
	@GetMapping("/book")
	public String getBookData(Model model) {	//To display the book data in UI page
		//Setting data to binding obj
		Book bookobj=new Book(101,"Spring",450.00);	
		
		//adding data to model obj to send to UI
		model.addAttribute("book", bookobj);
		
		//return view name
		return "book";		//JSP name
	}
/*	@GetMapping("/books")
public String getBooksData(Model model) {
		Book b1=new Book(101,"Spring",450.00);	
		Book b2=new Book(102,"Python",550.00);	
		Book b3=new Book(101,"AWS",350.00);	
		List<Book> objs=Arrays.asList(b1,b2,b3);
		model.addAttribute("books", objs);
		
		return "books";
}		*/
	@GetMapping("/books")
	public String getBookDatas(Model model) {
		model.addAttribute("book", getList());
		return "books";
	}
	
	private List<Book> getList(){
		List<Book> books=new ArrayList<>();
			books.add(new Book(1,"Marvel",230.00));
			books.add(new Book(2,"Disney",150.00));
			books.add(new Book(3,"Avatar",200.00));
			books.add(new Book(4,"Tarjan",120.00));
			return books;
			
		
	}
}
	

