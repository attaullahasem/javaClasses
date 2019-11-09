package com.class16;

public class InterviewQuestionNo4 {

	public static void main(String[] args) {
		// Quesstion No.4
		// How to find out the part of the string from a string? What is substring?
		// Find number of words in string?

		String str = "Today is very cold outside";

		String substring = str.substring(0, 5);
		System.out.println(substring);
		// How to find length of a string
		// following steps need to be done
		/*
		 * Step 1: Split based on the space---> array of string Step 2: find the length
		 * of an array
		 */

		String[] words = str.split(" ");
		System.out.println(words.length);
	}

}
