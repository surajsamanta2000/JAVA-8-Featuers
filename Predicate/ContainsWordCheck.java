package com.durgasoft.Predicate;

import java.util.function.Predicate;

public class ContainsWordCheck {
    public static void main(String[] args) {
        Predicate<String> containsJava = str -> str.contains("Java");

        System.out.println(containsJava.test("I love Java"));    // true
        System.out.println(containsJava.test("Hello World"));    // false
    }
}

