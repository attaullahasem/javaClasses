package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		
		//to change string to Array we use the following code
		// .toCharArray
		
		String str="Syntax";
		char[] array = str.toCharArray();
		System.out.println(str.toCharArray());
		
		for (char i:array) {
			System.out.println(i);
		}
		
	}

}
