package com.durgasoft.Predicate;

import java.util.function.Predicate;

public class NegateExample {
    public static void main(String[] args) {
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        System.out.println(isEmpty.test(""));          // true
        System.out.println(isNotEmpty.test("Hello"));  // true
        System.out.println(isNotEmpty.test(""));       // false
    }
}

