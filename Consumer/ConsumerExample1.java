package com.durgasoft.Consumer;


import java.util.function.Consumer;

public class ConsumerExample1 {
    public static void main(String[] args) {
        Consumer<String> printString = s -> System.out.println(s);
        printString.accept("Hello, Java Consumer!");
    }
}

