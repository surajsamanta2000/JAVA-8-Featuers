package com.durgasoft.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Slen {

	public static void main(String[] args) {
		
		String []names= {"ashish","suraj","rakesh","soumya"};
		
		List<String> result = Arrays.stream(names).filter(name->name.length()>5).collect(Collectors.toList());
		
		System.out.println(result);

	}

}
