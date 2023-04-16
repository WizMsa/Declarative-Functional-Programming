package com.mnesa.declarativefunctionprogramming.CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;

public class CustomerValidationService {

    public static void main(String[] args) {
        Customer customer = new Customer("Mnesa", "mnesa@gmail.com","+255659398798", LocalDate.of(2000,4,26));

        System.out.println("Is customer Valid?: " + isValid(customer));
    }

   static Predicate<String> isPhoneValid = phone->phone.startsWith("+");
    static Predicate<String> isEmailValid = email->email.contains("@");
    static Predicate<LocalDate> isAdult = dob-> Period.between(dob,LocalDate.now()).getYears() > 16;


   static boolean isValid(Customer customer){
        return isAdult.test(customer.getDob()) && isPhoneValid.test(customer.getPhone()) && isEmailValid.test(customer.getEmail());
    }
}
