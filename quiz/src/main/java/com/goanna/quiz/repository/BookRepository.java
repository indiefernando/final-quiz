package com.goanna.quiz.repository;


import com.goanna.quiz.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository {

    int insertBook(Book book);

    List<Book> getAllBooks();

    Book SelectById(int id);



}