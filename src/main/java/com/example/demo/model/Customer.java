package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String name;
    private final int customerId;
    private final List<Book> borrowedBooks = new ArrayList<>();

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBookToBorrowedBooks(Book book) {
        this.borrowedBooks.add(book);
    }
}
