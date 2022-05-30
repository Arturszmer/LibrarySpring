package com.example.demo;


import java.util.Optional;

public class BookService {
    final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook(Book book) {
        bookRepository.addBook(book);
    }
    public Book getBook(String title){
        bookRepository.getBook(title).orElseThrow(() -> new IllegalArgumentException("could not found book" + getBook(title)));
        return null;
    }
}
