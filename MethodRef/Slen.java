package com.durgasoft.MethodRef;

import java.util.function.Consumer;

public class Slen {
	
	public static void getName(String msg) {
		
	    System.out.println(" Hi "+ msg);
	}

	public static void main(String[] args) {
	
		Consumer<String> c=Slen::getName;
		c.accept("DEEPAK");

	}

}
