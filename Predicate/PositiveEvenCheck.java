package com.durgasoft.Predicate;

import java.util.function.Predicate;

public class PositiveEvenCheck {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        Predicate<Integer> isPositiveAndEven = isPositive.and(isEven);

        System.out.println(isPositiveAndEven.test(4));  // true
        System.out.println(isPositiveAndEven.test(3));  // false
    }
}

