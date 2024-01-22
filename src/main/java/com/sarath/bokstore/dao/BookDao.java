package com.sarath.bokstore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sarath.bokstore.entity.BookEntity;

@Repository
public interface BookDao extends JpaRepository<BookEntity,Integer>{
	
	@Query(value =  "Select * from book_entity where price = :price",nativeQuery = true)
	List<BookEntity> getBookByPrice(int price);

}
