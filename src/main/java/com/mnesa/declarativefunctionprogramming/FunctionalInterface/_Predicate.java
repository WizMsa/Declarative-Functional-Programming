package com.mnesa.declarativefunctionprogramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid.test("07172502534"));
        System.out.println(isPhoneNumberValid.test("0917250251"));


        System.out.println(isPhoneNumberValid.and(contains3).test("09172502513"));
        System.out.println(isPhoneNumberValid.or(contains3).test("09172502513"));

        System.out.println(contain3AndPH.test("Pharo",2));
        System.out.println(contain3AndPH.test("PHaro",3));
    }

    static BiPredicate<String,Integer> contain3AndPH = (name,age)-> name.contains("PH")&&age.equals(3);
    static Predicate<String> isPhoneNumberValid = number-> number.startsWith("07") && number.length() == 11;
    static Predicate<String> contains3 = number-> number.contains("3");
}
