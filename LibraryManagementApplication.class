// package com.library.service;

// import com.library.repository.BookRepository;

// public class BookService {

//     private BookRepository bookRepository;

//     // public void setBookRepository(BookRepository bookRepository) {
//         this.bookRepository = bookRepository;
//     }

//     public void showBooks() {
//         System.out.println("BookService is working");
//         bookRepository.displayBooks();
//     }
// }



package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("BookService is using BookRepository");
        bookRepository.getBooks();
    }
}