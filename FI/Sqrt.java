package com.durgasoft.FI;

@FunctionalInterface
interface Calculate{
	public int squareIt(int n);
}

public class Sqrt {

	public static void main(String[] args) {
		
		Calculate sqrt= n->n*n;
		
		System.out.println(sqrt.squareIt(4));
		
		System.out.println(sqrt.squareIt(5));

	}

}
