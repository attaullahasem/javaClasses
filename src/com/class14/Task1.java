package com.class14;

public class Task1 {

	public static void main(String[] args) {
//	 TASK1
		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
//		
		// TASK2
	//	​Create a String that should be combination of letters, numbers and special characters.
//  Find out how many alpha characters are there in the String.
		
		//TASK2​
//		You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
//  How would you find out how many sentences are in that String?

		
		//TASK1
		
		String str=" Hello My Friends  ";
		System.out.println(str.replace(" ",""));
		
		//TASK2
		
		String str1="123%Hello67$My90?Friends234@";
		
		System.out.println(str1.length());
		
		
		
		//TASK3
		
		String str3= "Is it saturday?. Is it raining?. Do we have a Java Class today?";
		String [] array=str3.split("\\?");
		System.out.println(" The number of Sentences in the given String is:: "+ array.length);
		System.out.println(array);
		
		for (String string:array) {
			System.out.println(string);
		
	}
	}
}
