package com.durgasoft.FI;

@FunctionalInterface
interface Interf{
	public void add(int a,int b);
}


public  class Test  {

	public static void main(String[] args) {
		
		Interf i= (a,b)->System.out.println("The Sum :"+(a+b));
		i.add(200, 300);

	}


}
