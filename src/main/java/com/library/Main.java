package com.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.library.books.models.Book;
import com.library.books.models.BookPurchase;
import com.library.customers.models.Customer;
import com.library.helpers.MockDatabase;
import com.library.helpers.Payment;
import com.library.helpers.PaymentMethodEnum;
import com.library.orders.model.Order;
import com.library.orders.services.OrdersService;

public class Main {

    public static void main(String[] args) {
        Main.simulateOrder();
    }

    private static void simulateOrder() {

        OrdersService ordersService = new OrdersService();
        MockDatabase mockDatabase = new MockDatabase();

        Customer mockCustomer = mockDatabase.getCustomers().get(0);
        List<Book> mockBooks = mockDatabase.getBooksInStock();
        List<BookPurchase> purchasedBooks = new  ArrayList<BookPurchase>();

        purchasedBooks.addAll(Arrays.asList(
            new BookPurchase(mockBooks.get(0), 3),
            new BookPurchase(mockBooks.get(1), 2),
            new BookPurchase(mockBooks.get(2), 7)
        ));

        double totalPrice = 0;

        for (BookPurchase purchasedBook : purchasedBooks) {
            totalPrice = totalPrice + purchasedBook.getBook().getPrice() * purchasedBook.getQuantity();
        }

        List<Payment> payments = new ArrayList<Payment>();

        payments.addAll(Arrays.asList(
            new Payment(PaymentMethodEnum.CREDIT_CARD, totalPrice * 0.7),
            new Payment(PaymentMethodEnum.BANKSLIP, totalPrice * 0.3)
        ));

        System.out.println("--------Iniciando pedido-------- \n");

        System.out.println("Estoque dos livros antes de realizar o pedido: \n");
        for (BookPurchase purchasedBook : purchasedBooks) {
            System.out.println("Livro: " + purchasedBook.getBook().getName());
            System.out.println("Estoque: " + purchasedBook. getBook().getStockQuantity() + '\n');
        }

        Order order = ordersService.createOrder(mockCustomer, purchasedBooks, payments);

        System.out.println("Informações de venda: \n");

        System.out.println("Valor total: R$" + order.getTotalPrice() + '\n');

        System.out.println("Informações do cliente: \n");
        System.out.println("Nome: " + order.getCustomer().getName());
        System.out.println("Email: " + order.getCustomer().getEmail() + '\n');

        System.out.println("Livros comprados: \n");

        for (BookPurchase purchasedBook : purchasedBooks) {
            System.out.println("Livro: " + purchasedBook.getBook().getName());
            System.out.println("Autor: " + purchasedBook. getBook().getAuthor());
            System.out.println("Ano de lançamento: " + purchasedBook. getBook().getReleaseYear());
            System.out.println("Número de páginas: " + purchasedBook. getBook().getNumberOfPages());
            System.out.println("Gêneros: " + purchasedBook. getBook().getGenres());
            System.out.println("Preço: " + purchasedBook. getBook().getPrice() + '\n');
        }

        System.out.println("Métodos de pagamento utilizados: \n");

        for (Payment payment : payments) {
            System.out.println("Método: " + payment.getPaymentMethod());
            System.out.println("Valor: R$" + payment.getPrice()  + '\n');
        }

        System.out.println("Estoque dos livros após de realizar o pedido: \n");

        for (BookPurchase purchasedBook : purchasedBooks) {
            System.out.println("Livro: " + purchasedBook.getBook().getName());
            System.out.println("Estoque: " + purchasedBook. getBook().getStockQuantity() + '\n');
        }

        System.out.println("--------Pedido finalizado--------");
    }
}