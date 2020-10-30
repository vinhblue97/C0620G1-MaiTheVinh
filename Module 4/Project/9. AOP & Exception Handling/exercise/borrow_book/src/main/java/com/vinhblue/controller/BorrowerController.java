package com.vinhblue.controller;

import com.vinhblue.model.entity.BookManagement;
import com.vinhblue.model.entity.BorrowerManagement;
import com.vinhblue.model.service.BookService;
import com.vinhblue.model.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({"", "/borrow"})
public class BorrowerController {

    @Autowired
    private BookService bookService;
    @Autowired
    private BorrowerService borrowerService;

    @GetMapping
    private String findAll(Model model) {
        model.addAttribute("borrowerList", this.borrowerService.findAll());
        model.addAttribute("bookList", this.bookService.findAll());
        return "home_page";
    }

    @GetMapping("/goCreate")
    private String goCreate(Model model) {
        BookManagement bookManagement = this.bookService.findById(1);
        model.addAttribute("name_request", "");
        BorrowerManagement borrowerManagement = new BorrowerManagement();
        borrowerManagement.setBookManagement(bookManagement);
        model.addAttribute("borrow", borrowerManagement);
        model.addAttribute("bookList", this.bookService.findAll());
        return "create_borrow_page";
    }

    @PostMapping("/create")
    private String create(@ModelAttribute BorrowerManagement borrowerManagement) {
        this.borrowerService.save(borrowerManagement);
        BookManagement bookManagement = this.bookService.findById(borrowerManagement.getBookManagement().getBookId());
        bookManagement.setBookQuantity(bookManagement.getBookQuantity()-1);
        this.bookService.save(bookManagement);
        return "redirect:/borrow";
    }

    @GetMapping("/createBook")
    private String goCreateBook() {
        return "redirect:/book/goCreate";
    }

    @PostMapping("/getQuantity")
    private String getQuantity(@RequestParam String name_request, @RequestParam String id_request, Model model) {
        BorrowerManagement borrowerManagement = new BorrowerManagement();
        borrowerManagement.setBorrowerName(name_request);
        BookManagement bookManagement = this.bookService.findById(Integer.valueOf(id_request));
        borrowerManagement.setBookManagement(bookManagement);
        model.addAttribute("name_request", name_request);
        model.addAttribute("borrow", borrowerManagement);
        model.addAttribute("bookList", this.bookService.findAll());
        return "create_borrow_page";
    }

}
