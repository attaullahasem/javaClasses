package com.class13;

public class StringManipulation1 {

	public static void main(String[] args) {
		
		// Sub String Method, this is sub string of a string
		
		String str= "Java is getting interesting";
		System.out.println(str.substring(15)); // 15 is the index number in the string and will print the 
		                                       // world interesting
System.out.println(str.substring(8, 15));// will print the word starting after index 8 and ending at index 15 
	}

}
