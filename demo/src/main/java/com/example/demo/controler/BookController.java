package com.example.demo.controler;

import org.springframework.stereotype.Controller;

@Controller
public class BookController {

  public String getBooks() {
    return "List of books";
  }

  public String getBookById(int id) {
    return "Book details for ID: " + id;
  }

}
