package com.library.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Book;
import com.library.repository.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	public Book addBook(Book book) {

		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooksById(long userId) {
		
		return bookRepository.getAllBooksByUserId(userId);
		
	}

}
