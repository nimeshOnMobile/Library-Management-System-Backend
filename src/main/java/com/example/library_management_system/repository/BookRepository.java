package com.example.library_management_system.repository;

import com.example.library_management_system.model.Book;
import com.example.library_management_system.model.BookStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCaseAndStatusOrAuthorContainingIgnoreCaseAndStatus(String title, BookStatus status1,
                                                                           String author, BookStatus status2);

    List<Book> findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(String title, String author );
    List<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByAuthorContainingIgnoreCase(String author);

    /*
        JPA = inbuilt methods
    */

}
