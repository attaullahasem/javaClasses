package com.class5;

import java.util.Scanner;

public class ScannerSelfPractice {

	public static void main(String[] args) {

		/*
		 * Create a java program, asking user, "if he has interest in Syntax",
		 * 
		 * if user has no interest ask him "to keep driving uber",
		 * 
		 * if you have less than 4000 enroll in Syntax, otherwise to Cybertech,
		 * 
		 */

		Scanner enrolment = new Scanner(System.in);

		System.out.println(" Do you have interest in SDET");

		boolean kK = enrolment.nextBoolean();

		if (kK) {
			System.out.println("How much budget you have");

			int budget = enrolment.nextInt();
			if (budget < 4000) {
				System.out.println("come to syntax");

			} else {

				System.out.println("you can go to Cybertek");
			}
		} else {

			System.out.println(" keep driving Uber");
		}
/*
 * 
 */
		Scanner alpha=new Scanner(System.in);
		System.out.println(" Do you have interest in SDET course");
		boolean interest= alpha.nextBoolean();
		if (interest) {
			System.out.println("How budget you have for course");
			int budget= alpha.nextInt();
			
		if (budget<4000){
			System.out.println("Come to Syntax");
		}else{
			System.out.println("better you go to Cybertek");
		}
	}
	}
}
