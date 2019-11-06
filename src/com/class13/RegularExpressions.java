package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		// print only text and remove numbers
		
		String str="1234Hel45645lo465456";
		System.out.println(str.replaceAll("[0-9]", "")); // it will remove the numbers and will print only text
		
		System.out.println(str.replaceAll("[a-zA-Z]", ""));// it will remove the text and will print the numbers only

		
		// will Remove everything except txt
		
		String str2="Hi&$%2345";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", "")); // this ^ is for do not ,this symbol comes with shift+F
		
		                                                          // this will not removes the numbers 
	}

}
