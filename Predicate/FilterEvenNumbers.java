package com.durgasoft.Predicate;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(isEven)
                                           .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }
}

