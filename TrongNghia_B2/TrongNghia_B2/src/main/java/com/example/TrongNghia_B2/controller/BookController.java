package com.example.TrongNghia_B2.controller;
import com.example.TrongNghia_B2.entity.Book;
import com.example.TrongNghia_B2.entity.IdGenerator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class BookController {
    @Autowired
    private List<Book> listBook;

    @GetMapping("/")
    public String showAllBooks(Model model){
        model.addAttribute("listBook", listBook);
        model.addAttribute("title", "Danh sách cuốn sách");
        return "book/list";
    }
    @GetMapping("/add")
    public String addBookForm(Model model){
        model.addAttribute("book", new Book());
        return  "book/add";
    }
    @PostMapping("/add")
    public String addBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model){
        if(result.hasErrors()){
            return "book/add";
        }
        book.setId(IdGenerator.getNextId());
        listBook.add(book);
        return "redirect:/";
    }


}

