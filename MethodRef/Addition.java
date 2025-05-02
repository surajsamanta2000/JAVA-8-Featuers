package com.durgasoft.MethodRef;

// BiConsumer return nothing
import java.util.function.BiConsumer;

public class Addition {

    public static void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> c = Addition::add; // Use BiConsumer for void methods
        c.accept(10, 20); // Calls add(10, 20)
    }
}

