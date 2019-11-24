package com.class09;

public class Pattern {

	public static void main(String[] args) {
		/*
		 * for (int k=1; k<=5; k++) { for (int l=1; l<=5; l++){
		 * System.out.println("*");// star will be printed 25 times } }
		 */
		// ****
		// ****
		// ****
		// ****
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		//*******
		// *******
		// *******
		// *******
		for (int i=0; i<5; i++) { // rows
			for (int y=0; y<=6; y++) { // columns
			System.out.print("*");
	}
			System.out.println();
		}
		
		System.out.println("############################################################");
		// &&&&&&&&&&
		//&&&&&&&&&&
		//&&&&&&&&&&
		//&&&&&&&&&&
		//&&&&&&&&&&
		//&&&&&&&&&&
		//&&&&&&&&&&
		
		for (int q=0; q<7; q++) {
			
			for (int k=0; k<=7; k++) {
				System.out.print("&");
			}
			System.out.println();
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		// print
		//12345
		//12345
		//12345
		//12345
	
		for (int i=1; i<5; i++) {
			for(int j=0; j<6; j++) {
				System.out.println(j);
			}
			System.out.println();
		}
		System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
		
		/*11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555
		 */
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
		/*123456789
		 * 123456789
		 * 12456789
		 * 123456789
		 * 123456789
		 */
		for (int i=5; i<=5; i++) {
			for (int j=5; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
		/*54321
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		for (int i=5; i>=1; i--) {
			for (int j=5; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
		/* 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 */
		for (int i=5; i>0; i--) { // controls rows
			for (int j=5; j>0; j--) {// control colonms
				System.out.print(i);
			}
			System.out.println();
	}
	}
}
