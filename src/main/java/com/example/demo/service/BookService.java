package com.example.demo.service;


import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        bookRepository.addBook(book);
    }

    public Book getBook(String title) {
        bookRepository.getBook(title).orElseThrow(() -> new IllegalArgumentException("could not found book" + title));
        return null;
    }
}
