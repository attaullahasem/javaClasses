package com.class5;

public class Task1 {

	public static void main(String[] args) {
		
		// Task2
		// Prompt the user to enter heights in
		// inches. Person should be classified
		// as one of the following
		// short (under 5 feet)
		// medium (5-6 feet)
		// tall (6 feet above
		int num = 8;
		if (num < 5) {
			System.out.println(" this is short");

		} else if (num==5 || num == 6) {
			System.out.println(" this is medium");
		} else if (num >= 6) {
			System.out.println(" this is tall");
		}
	}

}
