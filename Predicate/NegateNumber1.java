package com.durgasoft.Predicate;


import java.util.function.Predicate;

public class NegateNumber1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isNotEven = isEven.negate();

        System.out.println(isEven.test(4));     // true
        System.out.println(isNotEven.test(4));  // false
        System.out.println(isNotEven.test(5));  // true
    }
}

