package com.example.library_management_system.service;

import com.example.library_management_system.model.Book;
import com.example.library_management_system.model.BookStatus;
import com.example.library_management_system.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(Long bookId){
        bookRepository.deleteById(bookId);
    }

    public List<Book> searchBooks(String title, String author, boolean enhancedMode){

        BookStatus status = BookStatus.AVAILABLE;

        if(StringUtils.hasText(title) || StringUtils.hasText(author)){
            title = StringUtils.hasText(title) ? title : "";
            author = StringUtils.hasText(author) ? author : "";
            if(enhancedMode){
                return bookRepository.findByTitleContainingIgnoreCaseAndStatusOrAuthorContainingIgnoreCaseAndStatus(title,
                        status, author, status);
            }
            else{
                if(StringUtils.hasText(title) && StringUtils.hasText(author)){
                    return bookRepository.findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(title, author);
                }
                else if(StringUtils.hasText(title)){
                    return bookRepository.findByTitleContainingIgnoreCase(title);
                }
                else{
                    return bookRepository.findByAuthorContainingIgnoreCase(author);
                }
            }
        }
        else{
            return List.of();
        }

    }
}