package com.vinhblue.model.service;

import com.vinhblue.model.entity.BookManagement;

import java.util.List;

public interface BookService {
    List<BookManagement> findAll();

    void save(BookManagement bookManagement);

    BookManagement findById(Integer id);
}
