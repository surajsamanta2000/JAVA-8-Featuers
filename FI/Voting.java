package com.durgasoft.FI;

interface Age{
	public boolean isEligible(int age);
}

public class Voting {

	public static void main(String[] args) {
		
		Age age= a->a>=18;
		
	    System.out.println(age.isEligible(20));

	}

}
