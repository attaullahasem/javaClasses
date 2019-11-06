package com.class7;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ask user to pay for coffee You need to keep asking user to pay for it entered
		 * price is =5; After user paid then say " Enjoy your coffee"
		 */

		Scanner scan = new Scanner(System.in);
		int price;

		do {
			System.out.println(" Please pay for your coffee");
			price = scan.nextInt();

		} while (price != 5);
		System.out.println(" Enjoy your coffee");

// Second way
		int price1 = 0;
		System.out.println(" Please pay for your coffee");
		price = scan.nextInt();
		while (price1 != 5) {
			System.out.println(" Please pay for your coffee");
		}
	}
}
