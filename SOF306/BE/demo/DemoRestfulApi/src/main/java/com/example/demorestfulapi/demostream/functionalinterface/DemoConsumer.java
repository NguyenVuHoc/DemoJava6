package com.example.demorestfulapi.demostream.functionalinterface;

import java.awt.print.Printable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {
        Customer customer = new Customer("Hoc","0987");
        greet(customer);
        greetConsumer.accept(customer);
        greetBiConsumer.accept(customer,false);
    }
    static Consumer<Customer> greetConsumer = customer
            -> System.out.println("Hello " + customer.name + " " + customer.phone);

    static BiConsumer<Customer,Boolean> greetBiConsumer = (customer, show)
            -> System.out.println("Hello " + customer.name + " " + (show ? customer.phone:"****"));
    static void greet(Customer customer) {
        System.out.println("Hello " + customer.name + " " + customer.phone);
    }

    static class Customer {
        private final String name;
        private final String phone;

        Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
}
