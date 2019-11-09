package com.class15;

public class StringMoreExamples {

	public static void main(String[] args) {
		// how to get character at a specific location

		String str = "Syntax Technologies Inc";

		char letter = str.charAt(5);// will
		System.out.println(letter);// will print x

		/// string lenght is 19
		System.out.println(str.charAt(str.length()));// StringIndexBoudnError

		System.out.println(str.charAt(str.length() - 1));

		// how to get substring from a string
		// how to print Syntax

		String substr1 = str.substring(0, 6);
		System.out.println(substr1);
		// Technologies Inc
		String substr2 = str.substring(7);
		System.out.println(substr2);
	}

}
