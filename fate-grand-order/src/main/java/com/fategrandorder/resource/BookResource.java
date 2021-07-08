package com.fategrandorder.resource;

import java.util.List;
import java.util.Optional;

import com.fategrandorder.controllers.IBookController;
import com.fategrandorder.model.Book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/books")
public class BookResource {

    private IBookController iBookController;

    public BookResource(IBookController iBookController) {
        this.iBookController = iBookController;
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return iBookController.findAll();
    }

    // @GetMapping("/getBookById/{id}")
    // public Optional<Book> getBookById(@PathVariable("id") String id) {
    //     return iBookController.findById(id);
    // }
}
