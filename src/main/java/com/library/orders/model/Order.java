package com.library.orders.model;
import java.util.List;

import com.library.books.models.BookPurchase;
import com.library.customers.models.Customer;
import com.library.helpers.Payment;

public class Order {
    private List<BookPurchase> books;
    private Customer customer;
    private List<Payment> payments; 
    private double totalPrice;

    public Order() {
    }

    public Order(List<BookPurchase> books, Customer customer, List<Payment> payments, double totalPrice) {
        this.books = books;
        this.customer = customer;
        this.payments = payments;
        this.totalPrice = totalPrice;
    }
    
    public List<BookPurchase> getBooks() {
        return books;
    }
    public void setBooks(List<BookPurchase> books) {
        this.books = books;
    }
    
    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getValue() {
        return totalPrice;
    }
    
    public void setValue(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
