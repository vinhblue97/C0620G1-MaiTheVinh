package com.vinhblue.model.service.book.impl;

import com.vinhblue.model.entity.BookManagement;
import com.vinhblue.model.service.book.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public List<BookManagement> findAll() {
        return null;
    }
}
