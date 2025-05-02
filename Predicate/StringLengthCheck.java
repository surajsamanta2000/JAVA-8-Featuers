package com.durgasoft.Predicate;

import java.util.function.Predicate;

public class StringLengthCheck {
    public static void main(String[] args) {
        Predicate<String> isLongString = str -> str.length() > 5;
        System.out.println(isLongString.test("Hello"));     // false
        System.out.println(isLongString.test("Welcome"));   // true
    }
}

