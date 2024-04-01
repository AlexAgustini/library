package com.library.orders.model;
import java.util.List;

import com.library.books.models.Book;
import com.library.helpers.PaymentMethodEnum;

public class Order {
    private List<Book> books;
    private PaymentMethodEnum paymentMethod;
    private int value;

    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public PaymentMethodEnum getPaymentMethod() {
        return paymentMethod;
    }
    
    public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }


}
