package com.example.__TrongNghia.controller;

import com.example.__TrongNghia.entity.Book;
import com.example.__TrongNghia.services.BookService;
import com.example.__TrongNghia.services.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public String showAllBooks(Model model) {
        List<Book> books = bookService.getAllBook();
        model.addAttribute("books",books);
        return "book/list";
    }
    @GetMapping("/add")
    public String addBookForm(Model model) {
        model.addAttribute("book",new Book());
        model.addAttribute("categories",categoryService.getAllCategories());
        return "book/add";
    }
    @PostMapping("/add")
    public String addBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model){
        if(result.hasErrors())
        {
            model.addAttribute("categories",categoryService.getAllCategories());
            return "book/add";
        }
        bookService.addBook(book);
        return "redirect:/books";
    }

    @GetMapping("/edit/{id}")
    public String editBookForm(@PathVariable("id") long id, Model model)
    {
        Book editbook = bookService.getBookById(id);
        if(editbook != null)
        {
            model.addAttribute("book",editbook);
            model.addAttribute("categories", categoryService.getAllCategories());
            return "book/edit";
        }else{
            return "not-found";
        }
    }
    @PostMapping("/edit")
    public String editBook(@ModelAttribute("book") Book updatebook){
        bookService.updateBook(updatebook);
        return "redirect:/books";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") long id){
        bookService.deleteBook(id);
        return "redirect:/books";
    }

}