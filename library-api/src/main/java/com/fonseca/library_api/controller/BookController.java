package com.fonseca.library_api.controller;

import com.fonseca.library_api.model.Book;
import com.fonseca.library_api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookRepository repository;

    @GetMapping
    public List<Book> getAllBooks(){
        List<Book> bookList = repository.findAll();
        return bookList;
    }
}
