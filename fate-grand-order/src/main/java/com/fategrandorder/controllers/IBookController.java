package com.fategrandorder.controllers;

import com.fategrandorder.model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IBookController extends MongoRepository<Book, String> {
}
