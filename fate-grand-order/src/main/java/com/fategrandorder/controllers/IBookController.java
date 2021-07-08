package com.fategrandorder.controllers;

import java.util.List;

import com.fategrandorder.model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IBookController extends MongoRepository<Book, String> {
    public List<Book> FindAllBooks();
}
