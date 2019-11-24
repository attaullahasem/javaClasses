package com.class09;

public class TASK4Star {

	public static void main(String[] args) {
		// print
		/*
		 * * ** *** **** ***** **** *** ** *
		 */
		for (int a = 1; a <= 7; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int a = 7; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
