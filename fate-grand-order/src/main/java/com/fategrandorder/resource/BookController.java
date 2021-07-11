package com.fategrandorder.resource;

import java.util.List;

import com.fategrandorder.dao.BookDAO;
import com.fategrandorder.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/rest/books")
public class BookController {

    @Autowired
    private BookDAO bookDao = new BookDAO();

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/addBook")
    public void saveBook(@RequestBody List<Book> book) {
        bookDao.saveAll(book);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getBookById/{_id}")
    public Book getBookById(@PathVariable final String _id) {
        return bookDao.findById(_id);
    }
}
