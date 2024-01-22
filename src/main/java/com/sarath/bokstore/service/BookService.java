package com.sarath.bokstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sarath.bokstore.dao.BookDao;
import com.sarath.bokstore.entity.BookEntity;

@Service
public class BookService {
	
	@Autowired
	BookDao bookDao;
	
	public ResponseEntity<String> addBook(BookEntity book){
		
		bookDao.save(book);
		
		return new ResponseEntity<>("success",HttpStatus.CREATED);
		
	}
	
	public ResponseEntity<List<BookEntity>> getBooks(){
		
		return new ResponseEntity<>(bookDao.findAll(),HttpStatus.OK);
		
	}
	
	public ResponseEntity<List<BookEntity>> getBookByPrice(int price){
		return new ResponseEntity<>(bookDao.getBookByPrice(price),HttpStatus.OK);
	}

}
