package com.library.books.models;

public class BookPurchase {
    private Book book;
    private int quantity;

    public BookPurchase() {
        super();
    }

    public BookPurchase(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BookPurchase [\nbook=" + book + ", \nquantity=" + quantity + "]";
    }
    
    
}
