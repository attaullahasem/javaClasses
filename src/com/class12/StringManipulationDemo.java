package com.class12;

public class StringManipulationDemo {

	public static void main(String[] args) {
		// there are two ways to create String objects

		// first one is String Literal
		String name = "John";
		System.out.println(name);
		name.length();
		System.out.println("The length of nameis=" +name.length());

		// Second way is
		// Creating String with new key word
		String name1 = new String("John1");
		System.out.println(name1);

		/*
		 * This method returns the length of this string The length is equal to the
		 * number of 16-bit Unicode characters in the string
		 */
		int name1len = name.length();
		System.out.println("The length of name1 is=" + name1len);

		System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
		
		// To lower case
		// This method will count everything such as capitalization and content
		String str1="Hellow woRld";
		System.out.println("Before::"+str1);
		str1=str1.toLowerCase();
		
		System.out.println("After::"+str1);
		
		// this converts all the characters to Lower case
		// .equals()
		String str2="HElLo WoRld";
		
		boolean isEqual=str1.equals(str1);
		System.out.println(isEqual);
		
		// .equalsIgnoreCase();
		// This method does not care for capitalization and compare the
		// content only
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//  this converts all the characters to UPPER case
		// toUpperCase();
		
		String str3="Mohammad";
		
		System.out.println(" Before :: "+ str3);
		
		str3=str3.toUpperCase();
		
		System.out.println(" After :: "+ str3);
		
	}

}
