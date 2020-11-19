package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.BookManagement;
import com.vinhblue.model.repository.BookRepository;
import com.vinhblue.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookManagement> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public void save(BookManagement bookManagement) {
        this.bookRepository.save(bookManagement);
    }

    @Override
    public BookManagement findById(Integer id) {
        return this.bookRepository.findById(id).orElse(null);
    }
}
