package com.sarath.bokstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarath.bokstore.entity.BookEntity;
import com.sarath.bokstore.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/test")
	public void Test() {
		System.out.println("App Started!");
	}
	
	@PostMapping("/addBook")
	public ResponseEntity<String> addBook(@RequestBody BookEntity book){
		
		return bookService.addBook(book);
		
	}
	
	@GetMapping("/getBook")
	public ResponseEntity<List<BookEntity>> getBooks(){
		return bookService.getBooks();
	}
	
	@GetMapping("/getBookByPrice/{price}")
	public ResponseEntity<List<BookEntity>> getBookByPrice(@PathVariable int price){
		return bookService.getBookByPrice(price);
	}

}
