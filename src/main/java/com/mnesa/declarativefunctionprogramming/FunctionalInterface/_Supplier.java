package com.mnesa.declarativefunctionprogramming;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(fullNameSupplier.get());
    }

    static Supplier<String> fullNameSupplier = ()->"MNESA ASHBURN HASHIM";
}
