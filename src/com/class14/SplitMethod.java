package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		// this method is used to split the string

		String str=" Video provides a powerful way to help you prove your point";
		String [] array= str.split(" ");
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);// will print the above sentence into words array
		}
		
		// How can we find how many sentences are in the following String
		
		String str1="Today is Sunday. It's sunny day. and we are having java class";
		
		String [] array2=str1.split("\\.");
		System.out.println(" The number of Sentences in the given String is:: "+ array2.length);
		for (String string:array2) {
			System.out.println(string.trim());// trim will remove the spaces 
		}
	}

}
