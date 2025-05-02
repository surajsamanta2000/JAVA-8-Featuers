package com.durgasoft.Predicate;


import java.util.function.Predicate;

public class PredicateChaining {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isLessThan100 = n -> n < 100;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        Predicate<Integer> finalPredicate = isPositive.and(isLessThan100).and(isEven);

        System.out.println(finalPredicate.test(50));   // true
        System.out.println(finalPredicate.test(101));  // false
    }
}

