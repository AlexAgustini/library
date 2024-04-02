package com.library.books.models;

import java.util.List;

public class Book {

    private String name;
    private String author;
    private List <String> genres;
    private int releaseYear;
    private int numberOfPages;
    private int stockQuantity;
    private double price;

    public Book() {};

    public Book(
        String name, 
        String author, 
        List<String> genres, 
        int releaseYear, 
        int numberOfPages, 
        int stockQuantity,
        double price
    ) {
        this.name = name;
        this.author = author;
        this.genres = genres;
        this.releaseYear = releaseYear;
        this.numberOfPages = numberOfPages;
        this.stockQuantity = stockQuantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    
    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", genres=" + genres + ", releaseYear=" + releaseYear
                + ", numberOfPages=" + numberOfPages + ", stockQuantity=" + stockQuantity + ", price=" + price + "]";
    }

    
}
