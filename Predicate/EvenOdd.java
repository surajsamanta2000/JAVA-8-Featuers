package com.durgasoft.Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter A Number :");
		int n=sc.nextInt();
		
		Predicate< Integer> p=i->i%2==0;
		
		if(p.test(n))System.out.println("It is Even Number ");
		else System.out.println("It is an Odd Number");

	}

}
