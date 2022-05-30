package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private int customerId;
    List<Book> borrowedBooks = new ArrayList<>();

    public Customer(String name, int customerId){
        this.name = name;
        this.customerId = customerId;
    }
}
