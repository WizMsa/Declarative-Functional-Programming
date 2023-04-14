package com.mnesa.declarativefunctionprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println("Increment Function Result : " + incrementByOne.apply(5));
        System.out.println("Multiply Function Result : " +  multiplyByTen.apply(incrementByOne.apply(4)));


        Integer apply = incrementByOne.andThen(multiplyByTen).apply(10);
        System.out.println(apply);

        System.out.println(findingProduct.apply(3,7));

    }

    static Function<Integer,Integer> incrementByOne = number -> number+1;

    static Function<Integer,Integer> multiplyByTen = number-> number*10;

    static BiFunction<Integer,Integer,Integer> findingProduct = (num, number) -> num*number;
}
