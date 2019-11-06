package com.class10;

public class AllValuesFromArray1 {

	public static void main(String[] args) {
		// i want to print all values from an array
		// when vakues is Dog---> i love dogs	
		
		String[] animals= {"Cat","Dog","Cow","Snake","Elephant"};
		
		for ( int i=0; i<animals.length; i++) {
			if (animals[i].equals("Dog")) {
				System.out.println("I love Dog");
			}else {
				System.out.println(animals[i]);
			}
			}
		
		
	}
}
