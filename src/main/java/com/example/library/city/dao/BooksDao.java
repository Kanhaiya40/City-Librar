package com.example.library.city.dao;

import com.example.library.city.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksDao  extends JpaRepository<Books,Integer> {
}
