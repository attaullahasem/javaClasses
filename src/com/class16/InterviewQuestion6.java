package com.class16;

public class InterviewQuestion6 {

	public static void main(String[] args) {
		// Question No.6
		//Write a Java Program to find whether a String is palindrome or not? 
		// if reverse string and original string are same---> string is plaindrome
		// mom, dad, madam, racecar, kayak, bob, level, refer

		// we can do through following steps
		// step 1: reverse the string
		// step 2: compare 2 Strings
		// if strings are equal, they are palindrom
		// else not palindrom
		
		String original="kayak";
		String reversed="";
		
		for (int i=original.length()-1; i>=0; i--) {
		
		reversed=reversed+original.charAt(i); /// ""+k=k+a=ka+k		
	}
System.out.println(reversed);
}
}
