package com.library.helpers;

import com.library.orders.model.Order;

public class Payment {
    private Order order;
    private PaymentMethodEnum paymentMethodEnum;
    private double price;

    public Payment() {};

    public Payment(Order order, PaymentMethodEnum paymentMethodEnum, double price) {
        this.order = order;
        this.paymentMethodEnum = paymentMethodEnum;
        this.price = price;
    }
}