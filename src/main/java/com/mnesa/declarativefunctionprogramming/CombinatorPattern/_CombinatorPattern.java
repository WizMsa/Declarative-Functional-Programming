package com.mnesa.declarativefunctionprogramming.CombinatorPattern;

import java.time.LocalDate;

import static com.mnesa.declarativefunctionprogramming.CombinatorPattern.CustomerRegistrationValidator.*;
import static com.mnesa.declarativefunctionprogramming.CombinatorPattern.CustomerRegistrationValidator.ValidationResult.*;

public class _CombinatorPattern {
    public static void main(String[] args) {
        Customer customer = new Customer("myName", "my@Email.com", "+000000", LocalDate.of(2000, 4, 26));

        ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAdult()).apply(customer);

        System.out.println(result);
        if (result != SUCCESS) {
            throw new IllegalArgumentException(String.valueOf(result));
        }
    }
}
