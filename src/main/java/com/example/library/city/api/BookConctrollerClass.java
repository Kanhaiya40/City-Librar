package com.example.library.city.api;

import com.example.library.city.model.Books;
import com.example.library.city.service.BooksServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@RestController
public class BookConctrollerClass {

    @Autowired
    private BooksServiceClass serviceClass;


    @PostMapping("/add")
    public String addNewBooks(@RequestBody Books books)
    {
        serviceClass.addBook(books);
        return "Book Added To Database";
    }
    @DeleteMapping("/delete/{bookId}")
    public String deleteBooks(@PathVariable int bookId)
    {
        serviceClass.deleteBook(bookId);
        return "BooK Deleted From Database";
    }
    @GetMapping("allBooks")
    public List<Books> displayAllbooks()
    {
            return serviceClass.getAllBooks();
    }
    @GetMapping("getBooK/{bookId}")
    public Optional<Books> inqueryBook(@PathVariable int bookId)
    {
        return serviceClass.getBookById(bookId);
    }
}
