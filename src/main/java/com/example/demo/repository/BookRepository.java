package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Repository
public class BookRepository {

    private final Map<String, Book> books = new ConcurrentHashMap<>();

    public Optional<Book> getBook(String title) {
        return Optional.ofNullable(books.get(title));
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public List<Book> getBookList() {
        return List.copyOf(books.values());
    }
}
