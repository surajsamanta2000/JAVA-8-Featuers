package com.durgasoft.Num;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		if(num<=1)return false;
		
		return IntStream.range(2, num/2).noneMatch(divisor ->num%divisor==0);
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter A Number :");
		int num=sc.nextInt();
		
		if(isPrime(num))System.out.println(num+" Is a prime Number ");
		else System.out.println(num+" not a Prime Number");
		
		sc.close();
		

	}

}
