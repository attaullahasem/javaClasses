package com.class6;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs
		 * 
		 * 
		 * 
		 * if the average scoore >=90---grade =A if the average scoore >=70- and
		 * <90--grade =B if the average scoore >=50- and <70--grade =C if the average
		 * scoore <50---grade =F
		 */

		Scanner scan;
		int quiz, midTerm, finalScore, average;
		scan = new Scanner(System.in);
		System.out.println(" Please enter quiz score");
		quiz = scan.nextInt();

		System.out.println(" Please enter mid term score");
		midTerm = scan.nextInt();

		System.out.println(" Please enter final term score");
		finalScore = scan.nextInt();

		average = (quiz + midTerm + finalScore) / 3;

		if (average >= 90) {
			System.out.println("A");

		} else if (average >= 70 && average < 90) {
			System.out.println("B");

		} else if (average >= 50 && average < 70) {
			System.out.println("C");
		} else if (average < 50) {
			System.out.println(" D");
		} else {
			System.out.println("Unknown");
		}

	}

}
