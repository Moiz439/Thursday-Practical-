package com.example.employee.bookservice;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.example.employee.entity.Book;

@Component
public class BookService {

	public static List<Book> list=new ArrayList<Book>();
	
	static
	{
		list.add(new Book(101,"C",400,"ABC"));
		list.add(new Book(102,"C++",500,"PQR"));
		list.add(new Book(103,"Java",600,"XYZ"));
	}
	public List<Book> getAllBooks()
	{
		return list;
	}
	public Book getById(int id)
	{
		Book book=null;
	    book=list.stream().filter(e->e.getBid()==id).findFirst().get();
	    return book;
	}
}
