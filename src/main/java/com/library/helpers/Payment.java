package com.library.helpers;


public class Payment {
    private PaymentMethodEnum paymentMethodEnum;
    
    public PaymentMethodEnum getPaymentMethod() {
        return paymentMethodEnum;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public Payment() {};

    public Payment(PaymentMethodEnum paymentMethodEnum, double price) {
        this.paymentMethodEnum = paymentMethodEnum;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Payment [\npaymentMethodEnum=" + paymentMethodEnum + ",\nprice=" + price + "]";
    }
}