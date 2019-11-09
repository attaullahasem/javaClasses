package com.class16;

public class InterviewQuestion7 {

	public static void main(String[] args) {
		// Question No.7
		// Write a java program to check whether a given number is prime or not?
		// prime numbers are divisible by 1 and itself
		// 2,3,5,7,11,17,19,23

		// lets take range of numbers from 1 to 100 and print all prime numbers
		// 2,3,(2,3), 4(2,3,4), 5(2,3,4,5), 6(2,3,4,5,6) we will check each one whether
		// divisible by these numbers or not

		int num = 5;
		boolean isPrime = true;
		
		if (num<=1) {
			isPrime=false;
		}else {
			
		
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		}
		if (isPrime) {
			System.out.println(num + " is Prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
}
