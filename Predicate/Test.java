package com.durgasoft.Predicate;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		String str[]= {"Nag","Chiranjeevi","Venkatesh","Sunny"};
		Predicate<String> p=s->s.length()>5;
		
		for(String s:str) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}

	}

}
