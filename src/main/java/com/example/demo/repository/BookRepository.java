package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class BookRepository {

    private final List<Book> bookList = new ArrayList<>();

    public Optional<Book> getBook(String title) {
        return bookList.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst();
    }

    public void addBook(String title, String author) {
        bookList.add(new Book(title, author));
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
