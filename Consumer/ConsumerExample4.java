package com.durgasoft.Consumer;


import java.util.function.Consumer;

public class ConsumerExample4 {
    public static void main(String[] args) {
        Consumer<String> greet = s -> System.out.println("Hello " + s);
        Consumer<String> bye = s -> System.out.println("Goodbye " + s);

        greet.andThen(bye).accept("Suraj");
    }
}
