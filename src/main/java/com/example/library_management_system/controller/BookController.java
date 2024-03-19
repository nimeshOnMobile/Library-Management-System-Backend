package com.example.library_management_system.controller;

import com.example.library_management_system.model.Book;
import com.example.library_management_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.findAllBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @DeleteMapping("/{bookId}")
    public ResponseEntity<?> deleteBook(@PathVariable Long bookId){
        bookService.deleteBook(bookId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Book>> searchBooks(@RequestParam(value = "title", required = false) String title,
                                                  @RequestParam(value = "author", required = false) String author,
                                                  @RequestHeader(value = "Enhanced-Search", defaultValue = "false")
                                                  boolean enhancedMode){

        List<Book> books = bookService.searchBooks(title, author, enhancedMode);
        return ResponseEntity.ok(books);
    }
}
