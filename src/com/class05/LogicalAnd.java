package com.class05;

public class LogicalAnd {
	public static void main(String[] args) {
		/*
		 * if number is between 1-10---- this number is small, if number is between
		 * 10-100---- this number is medium, if number is between 100-1000---- this
		 * number is large, any other number is ----- is out of range
		 */
		int num = 2000;
		// true and false----false
		if (num > 1 && num < 10) {
			System.out.println("this number is small");
// true and false---false
		} else if (num >= 10 && num < 100) {
			System.out.println("this number is medium");
// true and true
		} else if (num >= 100 && num < 1000) {
			System.out.println("this number is large");
		} else {
			System.out.println(" Number is out of range");
		}

	}
}
