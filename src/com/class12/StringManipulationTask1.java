package com.class12;

public class StringManipulationTask1 {

	public static void main(String[] args) {
		// TASK1
		/*
		 * Create two Strings and initialize them with some values implement the
		 * following methods on those strings 
		 * sen.length();// done
		 *  sen.equals();
		 * sen.contains(s); // done
		 * sen.toUppperCase(); // done 
		 * sen.toLowerCase(); // done
		 * done sen.equalsIgnoranceCase(anotherString);
		 * 
		 */

		String strA = "Today we have Java class";
		System.out.println(strA.contains("Today"));
		String strB = " Tomorrow we are off";
		
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		// To UPPER CASE

		strA = strA.toUpperCase();
		System.out.println(strA);
		System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
		// To LOWER CAse
		strA = strA.toLowerCase();
		System.out.println(strA);

		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		// check LENGTH of string
		strA.length();
		System.out.println(strA.length());

		System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");

	
	
	}

}
