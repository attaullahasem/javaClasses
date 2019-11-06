package com.InterviewQuestions;

public class SecondALrgestNumberInArray {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?
		int[] numbers = {100, 10, 15, 766, 85};

		int largest = numbers[0]; /// we just assume that the largest number is 200
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				largest = numbers[i];

			}

		}
		System.out.println(largest);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		int smallest = numbers[0];
		for (int i = 0; i > numbers.length; i++) {

			if (numbers[i] > smallest) {
				smallest = numbers[i];
			}

		}
		System.out.println(smallest);
	}

}
