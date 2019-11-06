package com.class12;

public class StringManipulationOfIndexOf {

	public static void main(String[] args) {
		/*This method returns the index within this string of the first occurance of the specified character
		 * or -1 if the character does not occur
		 */

		String str8="We might not be done early";
		System.out.println(str8.indexOf('m'));
		System.out.println(str8.indexOf('m',4));
	}

}
