package com.vinhblue.controller;

import com.vinhblue.model.entity.BookManagement;
import com.vinhblue.model.entity.BorrowerManagement;
import com.vinhblue.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    private String goCreate(Model model) {
        model.addAttribute("book", new BookManagement());
        return "create_book_page";
    }

    @PostMapping("/create")
    private String create(@ModelAttribute BookManagement bookManagement) {
        this.bookService.save(bookManagement);
        return "redirect:/borrow";
    }



}
