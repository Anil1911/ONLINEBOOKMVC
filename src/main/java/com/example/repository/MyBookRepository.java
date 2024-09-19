package com.example.repository;

import com.example.entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {
    List<MyBookList> findByAuthor(String author);
    List<MyBookList> findByNameContaining(String name);
}
