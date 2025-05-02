package com.durgasoft.Predicate;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamNegateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        List<Integer> oddNumbers = numbers.stream()
                                          .filter(isEven.negate())
                                          .collect(Collectors.toList());

        System.out.println(oddNumbers); // [3, 5, 7]
    }
}

