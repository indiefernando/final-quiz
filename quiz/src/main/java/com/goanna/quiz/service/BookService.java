package com.goanna.quiz.service;

import com.goanna.quiz.entity.Book;
import com.goanna.quiz.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public int addBook(Book book){
        return bookRepository.insertBook(book);
    }

    public List<Book> findAllBooks(){
        return bookRepository.getAllBooks();
    }

    public Book getBooksByID(int id){
        return bookRepository.SelectById(id);
    }
}