package com.durgasoft.MethodRef;

import java.util.function.Predicate;

public class EvenOdd {
	
	public boolean checkEven(int n) {
		
		return n%2==0;
	}

	public static void main(String[] args) {
		
		EvenOdd eo=new EvenOdd();
		
		Predicate<Integer> a=eo::checkEven;
		
		if(a.test(2)) System.out.println("it is a Even Number");

	}

}
