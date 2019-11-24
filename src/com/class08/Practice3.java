package com.class08;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*
		 * Task 1// print numbers from 1 to 50 except those are divisible by 3
		 * 
		 * Task 2// Create a program that will be asking user to apply for a credit car
		 * 10 times. as soon you get an "yes" from the a user program should stop
		 * asking.
		 */

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
			// Task02
			
			
			Scanner scan = new Scanner(System.in);
			String ask;

			for (int a = 1; a <= 10; a++) {
				System.out.println("Do you want to apply for a credit card");
				ask = scan.nextLine();

				if (ask.equals("yes")) {

					break;
				}
			}
			System.out.println("I do not need credit card");
		}
}