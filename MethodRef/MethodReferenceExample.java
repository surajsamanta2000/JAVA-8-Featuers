package com.durgasoft.MethodRef;

import java.util.function.Consumer;

public class MethodReferenceExample {
	
	public void getMsg(String msg) {
		
		System.out.println("Hi "+msg);
	}

	public static void main(String[] args) {
		 
		MethodReferenceExample m=new MethodReferenceExample();
		
		Consumer<String> c=m::getMsg;
		
		c.accept("SURAJ");
		

	}

}
