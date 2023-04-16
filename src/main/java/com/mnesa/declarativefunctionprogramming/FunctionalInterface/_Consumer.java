package com.mnesa.declarativefunctionprogramming.FunctionalInterface;


import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        decrementByOne.accept(3);
        customerConsumer.accept(new Customer("Juma Sinare", 33));
        customerConsumerV2.accept(new Customer("Mnesa",24),true);
    }

    static class Customer{
        public String name;
        public int age;

        public Customer(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static Consumer<Integer> decrementByOne =  number -> {
        System.out.println(--number);
    };

    static Consumer<Customer> customerConsumer = customer -> {
        System.out.println(customer.age > 18 ? "Matured" : "Not Matured");
    };
    static BiConsumer<Customer,Boolean> customerConsumerV2 = (customer,isValid )-> {
        System.out.println(isValid ? "Valid "+customer.name : "Expired");
        System.out.println(customer.age > 18 ? "Matured " + customer.name : "Not Matured");
    };
}
