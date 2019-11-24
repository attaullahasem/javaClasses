package com.class04;

public class IfElseRecap {

	public static void main(String[] args) {
		/*
		 * Class schedule if Tuesday ----> sdlc classs 
		 * if wednesday -----> java review
		 * if tursday----> sdlc 
		 * classs if saturday ----> Java coding
		 *  if sunday -------> my favorite Java coding
		 * 
		 */

		int day = 4;
		if (day == 2) {
			System.out.println("SDLC Class");
		} else if (day == 3) {
			System.out.println("Review Class");
		} else if (day == 4) {
			System.out.println(" SDLC Class");
		} else if (day == 6) {
			System.out.println(" Java Class");
		} else if (day == 7) {
			System.out.println(" Favorite Jaa Class");
		} else {
			System.out.println(" There is no classs at school");
		}
	}

}
