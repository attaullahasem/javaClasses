package com.class04;

public class NestedIfPractice {

public static void main(String[] args) {
	
	boolean isFriday=true;
	int day=13;
	// if today is friday only day i want to check if it is 13
	
	if (isFriday) {
		System.out.println("Today is Friday");
		
		if (day==13) {
			System.out.println(" i will watch scary movie");
		}
	}else {
		System.out.println(" today is NOT Friday");
	}
}	
	
	
	
}
