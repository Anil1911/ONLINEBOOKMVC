package com.example.service;

import com.example.entity.MyBookList;
import com.example.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MyBookListService {

    @Autowired
    private MyBookRepository mybook;

    @Transactional
    public void save(MyBookList book) {
        mybook.save(book);
    }

    public List<MyBookList> getAllMyBooks() {
        return mybook.findAll();
    }

    public MyBookList getMyBookById(int id) {
        return mybook.findById(id)
                .orElseThrow(() -> new RuntimeException("MyBook not found: " + id));
    }

    @Transactional
    public void deleteById(int id) {
        mybook.deleteById(id);
    }
}
