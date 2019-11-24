package com.class09;

import java.util.Scanner;

public class HomeWork10 {

	public static void main(String[] args) {

		// Write a guessing game where the user has to guess
//		a secret number between 1 and 20. After every guess
//		input, the program tells the user whether their number
//		was too large or too small. The program will keep
//		asking the user to enter the number until he finds
//		 the correct number. When the correct answer is found
//		 the system should display “Congratulations!!.
//		You got it!”

		Scanner scan = new Scanner(System.in);
		int secretNumber;
		int guessNumber;

		scan = new Scanner(System.in);

		secretNumber = 12;

		do {
			System.out.println(" Please guess number form 1 to 20");
			guessNumber = scan.nextInt();
			if (guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			} else if (guessNumber > secretNumber) {
				System.out.println("Your number is too large");
			}
		} while (guessNumber != secretNumber);
		System.out.println("COngratulations you got it");

	}
}
