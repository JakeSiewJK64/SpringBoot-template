package com.fategrandorder.resource;

import java.util.List;

import com.fategrandorder.controllers.IBookController;
import com.fategrandorder.dao.BookDAO;
import com.fategrandorder.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/rest/books")
public class BookResource {

    @Autowired
    private BookDAO bookDao = new BookDAO();

    @PostMapping("/addBook")
    public void saveBook(@RequestBody List<Book> book) {
        bookDao.saveAll(book);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }

    @GetMapping("/getBookById/{_id}")
    public Book getBookById(@PathVariable final String _id) {
        return bookDao.findById(_id);
    }
}
