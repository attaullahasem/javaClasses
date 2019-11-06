package com.class2;

public class StringConcatenation {

	
	public static void main(String[] args) {
		
		String name= "Anna";
		//display in console Good Morning Anna
		
		System.out.println("Good morning "+ name);
		
		int day= 22;
		// today is September 22
		System.out.println("Today is September "+22);
		
		String text= "Today is September";
		System.out.println(text + day);// Today is September22
		
		// Home Work Example;
		// write in java program, My name is -------
		//My last name is ------
		// I live in city oof ------
		// I live in state of
		// My phone number is -----
		
		String name1= "Atta";
		String lastName1="Asim";
		char myGrade='A';
		String city1="Reston";
		String state1="VA";
		int phoneNumber=12345678;
		
		System.out.println("My name is " +name1);
		System.out.println("My last name is " +lastName1);
		System.out.println("My grade is " +myGrade);
		System.out.println("I live in city of " +city1);
		System.out.println("I live in state of " +state1);
		System.out.println("My cell phone number is " +phoneNumber);
	
		// TAsk:1,
		// add string 123, and lenght l=4 and widht w=5
		
		
		String a="123";
		byte l=4;
		byte w=5;
		System.out.println("123"+l+w);// 12345
		System.out.println("123"+ (l+w));// 1239
		System.out.println(l+"2"+w);//425
		
		//Task 3;
		
		System.out.println(1+"2"+3);//123
		System.out.println(1+2+"3");//33
		System.out.println((1+2)+"3");//33
		System.out.println(12+6/3);//14
		
		
		
		
	
	}
}
