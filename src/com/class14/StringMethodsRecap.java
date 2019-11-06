package com.class14;

public class StringMethodsRecap {

	public static void main(String[] args) {
		// if we want to replace a character in a text we use the following code
		//.replace
		// 

		
		String str="Syntax Technologies";
		System.out.println(str.replace('y', 'i'));// will replace y by i
		
		System.out.println("***************************************************************");
		// .replace
		System.out.println(str.replace("your", "My"));
		
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		
		// .replaceAll
		
		String str2=" tomorrow we will go to school and will play football in the break";
		
		System.out.println(str2.replaceAll("tomorrow","Monday" ));
		System.out.println(str2.replaceAll("to(.*)", ""));// this will remove everything after the world after "to"
		
		String str3=" 2345Hell3456o";
		System.out.println(str3.replaceAll("[0-9]",""));// will remove all the numbers and will print the Hello
		System.out.println(str3.replaceAll("[A-z]",""));// will remove all the characters and will print only numbers
		
		System.out.println(str3.replaceAll("[^A-z]",""));// will remove everything and will leave only characters
		
	System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");	
	
	System.out.println(str2.replaceFirst("will", "may"));
	
	
	}

}
