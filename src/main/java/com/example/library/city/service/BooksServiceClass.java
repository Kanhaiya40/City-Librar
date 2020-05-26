package com.example.library.city.service;

import com.example.library.city.dao.BooksDao;
import com.example.library.city.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
public class BooksServiceClass {

    @Autowired
    private BooksDao bookrepo;

    public Books addBook(Books books)
    {
       return bookrepo.save(books);
    }
    public void deleteBook(int bookId)
    {
        bookrepo.deleteById(bookId);
    }
    public List<Books> getAllBooks()
    {
        return bookrepo.findAll();
    }
    public Optional<Books> getBookById(int bookId)
    {
        return bookrepo.findById(bookId);
    }
}
