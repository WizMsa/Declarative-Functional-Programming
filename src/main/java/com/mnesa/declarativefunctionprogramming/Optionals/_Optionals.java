package com.mnesa.declarativefunctionprogramming.Optionals;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {

        Optional.empty()
                .ifPresentOrElse(
                        System.out::println, () -> System.out.println("Hakuna Iko Kitu")
                );

        Optional.of("Hello")
                .ifPresentOrElse(
                        System.out::println, () -> System.out.println("Hakuna Iko Kitu")
                );
    }
}