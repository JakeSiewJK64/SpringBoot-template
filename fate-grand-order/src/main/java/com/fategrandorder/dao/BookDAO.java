package com.fategrandorder.dao;

import java.util.List;

import com.fategrandorder.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Book> findAll() {
        return mongoTemplate.findAll(Book.class);
    }

    public void saveAll(final List<Book> bookList) {
        mongoTemplate.insertAll(bookList);
    }

    public Book findById(final String Id) {
        return mongoTemplate.findById(Id, Book.class);
    }
}
