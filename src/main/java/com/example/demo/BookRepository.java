package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {
    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    public Optional<Book> getBook(String title) {
        return bookList.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst();
    }

    public void addBook(Book book){
        bookList.add(book);
    }
}
