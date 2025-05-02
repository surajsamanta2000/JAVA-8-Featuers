package com.durgasoft.StreamApi;

import java.util.Arrays;

public class PrintName {

	public static void main(String[] args) {
		
		String[] names= {"suraj","Rama","Manas","Biswa","Soumya","Sonu"};
		
		Arrays.stream(names).filter(name->name.toLowerCase().startsWith("s")).
		forEach(System.out::println);

	}

}
