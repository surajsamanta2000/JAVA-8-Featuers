package com.durgasoft.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample {
	
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("suraj","raaj","shiva","nitish");
		
		names.stream().map(String::toUpperCase).forEach(System.out::println);

	}

}
