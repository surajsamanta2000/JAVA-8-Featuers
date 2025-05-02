package com.durgasoft.FI;

interface CheckEven{
	
	public boolean checkEven(int n);
	
}

public class EvenNumber {

	public static void main(String[] args) {
		
		CheckEven ce= e->e%2==0;
		
		System.out.println(ce.checkEven(6));

	}

}
