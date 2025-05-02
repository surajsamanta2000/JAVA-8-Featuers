package com.durgasoft.FI;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Addition {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Two Number :");
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		BiFunction<Integer, Integer,Integer> add= (a1,b1)->a1+b1;
		
		System.out.println(add.apply(a, b));
		
		sc.close();

	}

}
