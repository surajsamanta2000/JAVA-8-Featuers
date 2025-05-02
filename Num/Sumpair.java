package com.durgasoft.Num;

import java.util.HashSet;
import java.util.Set;

public class Sumpair {

	public static void main(String[] args) {
		
		Integer arr[]= {3,5,1,6,2,7,9};
		
		int sum=8;
		
		Set<Integer> hs= new HashSet<Integer>();
		
		for(int n:arr) {
			
			int complment=sum-n;
			
			if(hs.contains(complment)) {
				//System.out.println(complment+" + "+n+" = "+sum);
				System.out.println("%d + %d = %d".formatted(complment,n, sum));
			}
			
			hs.add(n);
		}

	}

}
