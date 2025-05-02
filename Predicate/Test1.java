package com.durgasoft.Predicate;

import java.util.Arrays;


public class Test1 {

	public static void main(String[] args) {
		
		String [] arr= {"Suraj","manas","biswa","soumya","Sonu"};
		
		Arrays.stream(arr).filter(s->s.toLowerCase().startsWith("s")).forEach(System.out::println);

	}

}
