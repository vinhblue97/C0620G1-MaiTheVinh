package com.vinhblue.controller;

import com.vinhblue.model.entity.BookManagement;
import com.vinhblue.model.entity.BorrowerManagement;
import com.vinhblue.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    private String homPage(Model model) {
        model.addAttribute("bookList", this.bookService.findAll());
        return "home_page";
    }

    @GetMapping("/goCreate")
    private String goCreate(Model model) {
        model.addAttribute("book", new BookManagement());
        return "create_book_page";
    }

    @PostMapping("/create")
    private String create(@ModelAttribute BookManagement bookManagement) {
        this.bookService.save(bookManagement);
        return "redirect:/";
    }


}
