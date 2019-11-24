package com.class18;

public class Task1 {
	public static void main(String[] args) {
		Task1 task = new Task1();
		task.largerNumber(300, 300);
		task.evenOrOdd(99);
		task.evenOrOdd(10);
		task.palindrome("hello");//argument
		task.palindrome("madam");
	}
		//methodName (2 int type parameters)
	void largerNumber(int firstNumber, int secondNumber) {
		if (firstNumber > secondNumber) {
			System.out.println("The larger number is" + " " + firstNumber);
		} else if (firstNumber < secondNumber) {
			System.out.println("The larger number is" + " " + secondNumber);
		} else {
			System.out.println("Numbers are equal");
		}
	}

	void evenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("the number is even number");
		} else {
			System.out.println("the number is odd number");
		}
	}

	void palindrome(String word) {
        String reverse = "";
        for (int i =word.length() - 1; i >= 0; i--) {
              reverse = reverse + word.charAt(i);
        } 
        
		if (word.equals(reverse)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string isn't a palindrome.");
        }
    }
}
