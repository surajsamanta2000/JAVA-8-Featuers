package com.durgasoft.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectExample {

	public static void main(String[] args) {
		
		String[] names= {"Suraj","Manas","Biswa","Soumya","Abhishek"};
		
		List<String> result= Arrays.stream(names).filter(name->name.startsWith("S")).
				collect(Collectors.toList());
		
		System.out.println(result);

	}

}
