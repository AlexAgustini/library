package com.library.books.models;

public class BookPurchase {
    private Book book;
    private int quantity;

    public BookPurchase() {
        super();
    }

    public BookPurchase(com.library.books.models.Book book, int quantity) {
        book = book;
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
