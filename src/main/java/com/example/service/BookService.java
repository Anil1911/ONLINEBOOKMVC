package com.example.service;

import com.example.entity.Book;
import com.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bRepo;

    @Transactional
    public void save(Book b) {
        bRepo.save(b);
    }

    public List<Book> getAllBooks() {
        return bRepo.findAll();
    }

    public Book getBookById(int id) {
        return bRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found: " + id));
    }

    @Transactional
    public void deleteById(int id) {
        bRepo.deleteById(id);
    }
}
