package com.durgasoft.Predicate;

import java.util.function.Predicate;

public class PositiveCheck {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = n -> n > 0;
        System.out.println(isPositive.test(5));  // true
        System.out.println(isPositive.test(-3)); // false
    }
}

