package com.vinhblue.controller;

import com.vinhblue.model.service.BookService;
import com.vinhblue.model.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/borrow")
public class BorrowerController {

    @Autowired
    private BookService bookService;
    @Autowired
    private BorrowerService borrowerService;

    @GetMapping("/goBorrow")
    private String goBorrow(){
        return "borrow_form_page";
    }




}
