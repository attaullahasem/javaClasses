package com.class12;

public class StringManipulationEmpty {

	public static void main(String[] args) {
		// this methods wether the string is empty or not
		// the response will be in true or false
		// is empty, ele it returns false
		
		String str="";
		System.out.println(" Is this string empty =\n"+ str.isEmpty());//True
		
		String str2="Hellow";
		System.out.println(" Is this string empty "+ str2.isEmpty());// false
		
		if(!str.isEmpty()) {
			System.out.println(" This is not empty");
		}else { System.out.println("This is empty");
		
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		
		String sentence=" Each day has a promise to brighten up the day,\nBut first you must allow the sun to come your way";
		System.out.println(sentence);
	}
	}
}
