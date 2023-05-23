package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.bookservice.BookService;
import com.example.employee.entity.Book;

@RestController
public class Controller {

	@GetMapping("/home")
	public Book getData()
	{
		Book b=new Book();
		b.setBid(101);
		b.setBname("C Language");
		b.setBprice(500);
		b.setAuthor("Danis Richi");
		
		return b;
	}
	
	@Autowired
	private BookService bs;
	@GetMapping("/Books")
	public List<Book> getBooks()
	{
		return this.bs.getAllBooks();
	}
	
	@GetMapping("/Books/{id}")
	public Book getBook(@PathVariable("id") int id)
	{
		return bs.getById(id);
	}
}
