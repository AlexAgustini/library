package com.library.orders.services;

import java.util.List;

import com.library.books.models.Book;
import com.library.books.models.BookPurchase;
import com.library.customers.models.Customer;
import com.library.orders.model.Order;
import com.library.helpers.Payment;;

public class OrdersService {
    public Order createOrder(Customer customer, List<BookPurchase> booksPurchases, List<Payment> payments) {

        double totalPrice = 0;

        for (BookPurchase book : booksPurchases) {
            
            int quantity = book.getQuantity();
            double bookPrice = book.getBook().getPrice();

            totalPrice = totalPrice + bookPrice * quantity;
        }


        Order order = new Order(booksPurchases, customer, payments, totalPrice);


        return order;
    }
}
