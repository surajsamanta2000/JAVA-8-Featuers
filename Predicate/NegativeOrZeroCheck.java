package com.durgasoft.Predicate;

import java.util.function.Predicate;

public class NegativeOrZeroCheck {
    public static void main(String[] args) {
        Predicate<Integer> isNegative = n -> n < 0;
        Predicate<Integer> isZero = n -> n == 0;

        Predicate<Integer> isNegativeOrZero = isNegative.or(isZero);

        System.out.println(isNegativeOrZero.test(0));   // true
        System.out.println(isNegativeOrZero.test(-5));  // true
        System.out.println(isNegativeOrZero.test(10));  // false
    }
}
