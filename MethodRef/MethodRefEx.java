package com.durgasoft.MethodRef;

import java.util.function.Consumer;

public class MethodRefEx {
	
	public static void Msg(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		Consumer<String> consumer =MethodRefEx::Msg;
		consumer.accept("GOOD MORNING !");

	}

}
