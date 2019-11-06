package com.class3;

public class IfCOnditions {
	public static void main(String[] args) {

		int a = 90;
		int b = 300;

// if number a is bigger than number b
// i want print a is larger than b

		if (a > b) {

			System.out.println("a is larger than b");
		} else {
			System.out.println("a is smaller than b");

		}

		int expectedHours = 15;
		int actualkHours = 2;

		// if expected hours are more than actual --> you will succeed
		// otherwise, please study more

		if (actualkHours > expectedHours) {
			System.out.println("you will succeed");
		} else {
			System.out.println(" please study more");

		}

		double teaPrice = 4.99;
		double allowed = 3.99;
		// if price is more than i can afford i will NOT buy
		// if price is less or match what i can afford then i will BUY tea
		if (allowed >= teaPrice) {
			System.out.println("i will buy");
			System.out.println(" And i will enjoy my tea");
		} else {
			System.out.println(" i can not afford, i need to study more");
			System.out.println(" i will go back to study more");
		}
		
		System.out.println("I keep writig some code");
		System.out.println(" i keep writing more code");
	}
}
