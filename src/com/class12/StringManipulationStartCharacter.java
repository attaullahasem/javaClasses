package com.class12;

public class StringManipulationStartCharacter {

	public static void main(String[] args) {
		// this method test if the string STARTS with the mentioned words
		// specified prefix begining
		String str2= "It is very hot in the class";
		
		System.out.println("is this string starts with="+ str2.startsWith("It"));
		//System.out.println("is this string starts wiht="+ str2.startsWith("It"),3);

		
		// this method test if the string ENDS with the mentioned words
		// specified suffix begining
		System.out.println("is this string ends with="+ str2.endsWith("class"));
	}

}
