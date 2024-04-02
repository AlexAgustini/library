package com.library.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.library.address.model.Address;
import com.library.books.models.Book;
import com.library.customers.models.Customer;

public class MockDatabase {
    
    private List<Book> booksInStock = new ArrayList<Book>();
    private List<Customer> customers = new ArrayList<Customer>();
        
    public MockDatabase() {
        initializeBooks();
        initializeCustomers();
    }

    private void initializeBooks() {
        booksInStock.addAll(Arrays.asList( 
            new Book(
            "Livro 1", 
            "João", 
            Arrays.asList("Suspense", "Ficção"), 
            1987, 
            152, 
            17, 
            175.24
            ), new Book(
            "Livro 2", 
            "José", 
            Arrays.asList("Drama", "Romance"), 
            2015, 
            192, 
            93, 
            231
            ), 
            new Book(
            "Livro 3", 
            "Marcos", 
            Arrays.asList("Comédia"), 
            2001, 
            83, 
            38, 
            97.59
            ),
            new Book(
            "Livro 4", 
            "Mateus", 
            Arrays.asList("História", "Antiguidade"), 
            1952, 
            743, 
            192, 
            301.85
            ), new Book(
            "Livro 5", 
            "Lucas", 
            Arrays.asList("Suspense"), 
            2006, 
            248, 
            68, 
            113.85
            )
        ));
    }

    private void initializeCustomers() {

       customers.addAll(Arrays.asList(
            new Customer(
            "Alex",
            "alex@gmail.com",
            20,
            new Address("Rua A", "Paraná", "Brasil", "Bairro Y", 2070)
            ),
            new Customer(
            "Junior",
            "junior@gmail.com",
            28,
            new Address("Rua B", "Santa Catarina", "Brasil", "Bairro X", 392)
            ),
            new Customer(
            "Gabriel",
            "gabriel@gmail.com",
            18,
            new Address("Rua C", "Rio Grande do Sul", "Brasil", "Bairro Z", 932)
            )
       ));
    }
}
