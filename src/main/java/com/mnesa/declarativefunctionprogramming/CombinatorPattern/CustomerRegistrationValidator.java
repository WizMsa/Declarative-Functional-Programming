package com.mnesa.declarativefunctionprogramming.CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static com.mnesa.declarativefunctionprogramming.CombinatorPattern.CustomerRegistrationValidator.*;
import static com.mnesa.declarativefunctionprogramming.CombinatorPattern.CustomerRegistrationValidator.ValidationResult.*;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {


    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneValid() {
        return customer -> customer.getPhone().startsWith("+") ? SUCCESS : PHONE_NOT_VALID;
    }

    static CustomerRegistrationValidator isAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ? SUCCESS : NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = other.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        NOT_AN_ADULT,
        EMAIL_NOT_VALID,
        PHONE_NOT_VALID,
    }
}
