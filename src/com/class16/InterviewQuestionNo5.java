package com.class16;

public class InterviewQuestionNo5 {

	public static void main(String[] args) {
		
		//Question No.5
		//  Write a java program to reverse String? Reverse a string word by word? 

		String given=" Welcome to the Java class";
		/* to reverse string we need following steps
		 * split the string
		 * step 1: split ---> array of string
		 * step 2: use for loop and use decrement
		 */
		// Part 1 Reverse a string word by word
		String reversed="";
		String [] str= given.split("\\s");
		for (int j=str.length-1; j>=0; j--) {
			reversed=reversed+str[j]+" ";	
	}
		System.out.println(reversed);	
		
		System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
		// Part 2  Write a java program to reverse String
		// toCharArray();
		// one way 
		
		String given1=" Today is Java class";
		char [] charArray=given1.toCharArray();
		for (int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHh");
		// second way
		// charAt(); method
		
		String Word3=" I love Java";
		for (int i=Word3.length()-1; i>=0; i--) {
			System.out.print(Word3.charAt(i));
		
		}
	}
}
