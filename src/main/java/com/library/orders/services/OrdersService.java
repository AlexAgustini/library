package com.library.orders.services;

import java.util.List;

import com.library.books.models.BookPurchase;
import com.library.customers.models.Customer;
import com.library.orders.model.Order;
import com.library.helpers.Payment;;

public class OrdersService {
    public Order createOrder(Customer customer, List<BookPurchase> booksPurchases, List<Payment> paymentTypes) {

        double totalPrice = 0;

        for (BookPurchase book : booksPurchases) {
            
            int quantity = book.getQuantity();
            double bookPrice = book.getBook().getPrice();

            totalPrice = totalPrice + bookPrice * quantity;
        }


        Order order = new Order(booksPurchases, customer, paymentTypes, totalPrice);


        updateBookStock(booksPurchases);

        return order;
    }

    private void updateBookStock(List<BookPurchase> purchasedBooks) {
        for(BookPurchase purchasedBook: purchasedBooks ) {
            int oldStockQuantity = purchasedBook.getBook().getStockQuantity();
            int quantityPurchase = purchasedBook.getQuantity();
            int newStock = oldStockQuantity - quantityPurchase;

            purchasedBook.getBook().setStockQuantity(newStock);
         }
    }

}
