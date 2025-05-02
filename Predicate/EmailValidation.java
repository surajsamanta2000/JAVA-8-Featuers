package com.durgasoft.Predicate;

import java.util.function.Predicate;

public class EmailValidation {
    public static void main(String[] args) {
        Predicate<String> isValidEmail = email -> email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

        System.out.println(isValidEmail.test("test@example.com"));   // true
        System.out.println(isValidEmail.test("wrong-email"));        // false
    }
}

