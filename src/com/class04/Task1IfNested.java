package com.class04;

public class Task1IfNested {

	public static void main(String[] args) {

		boolean dipla = true;
		double gpa = 3.2;

		if (dipla) {
			System.out.println("Congratulations");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for schoalrship");
			} else if (gpa <= 3.5) {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("You should get a degree");
		}
		System.out.println("+++++++++++++++++++++++++++++++++");

		// Task 2:

		double morgage = 4.4;
		int price = 250000;

		if (morgage >= 4.5) {
			System.out.println("User will not buy a house");
		} else {
			System.out.println("User will buy a house");

			if (price > 200000) {
				System.out.println(" You need loan from a bank");
			} else {
				System.out.println(" You pay cash");
			}
		}
	}
}