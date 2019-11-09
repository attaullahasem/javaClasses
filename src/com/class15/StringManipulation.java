package com.class15;

public class StringManipulation {

	public static void main(String[] args) {
		// .replace

		String str = " Java classes at Syntax are awsome";
		str = str.replace("awsome", "great");
		System.out.println(str);// will replace awsome by great
		str = str.replace("Git", " SDLC");
		System.out.println(str);

		
		// replaceAll----> specify the regular expression
		// lets remove all special characters 
		String str5= "18185#4%*7";
		str=str.replaceAll("[^a-z0-9]", "" );
		System.out.println(str);// will replace everything except the charcters and numbers
		System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
		
		
		//Split
		
		String myString="Java classes at Syntax are awsome";
		String [] array=myString.split("c"); // it will split the array at every c
		System.out.println(array.length);
		
		
	}

}
