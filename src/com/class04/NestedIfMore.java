package com.class04;

public class NestedIfMore {

	public static void main(String[] args) {
		/*
		 * check age, if age is less than 16----> too young to drive otherwise ---> you
		 * are eligible to drive and we will check if you are older than 18----> you can
		 * get driver license and if not you can get driver permit
		 */
		int age = 55;
		if (age < 16) {
			System.out.println(" you are too young to drive");
		} else {
			System.out.println(" you are eligible to drive");

			if (age >= 18) {
				System.out.println(" you can drive alone");
			} else {
				System.out.println(" you need your parents to drive");
			}
		}
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		/* we need to check if student completed the quiz
		 * if Yes----> Good Job, if not ----> NoT Good
		 * If they completed we will check score
		 * if more than 90---> you got an A
		 * if more than 80----> you got a B
		 * anythin below ----> you should study more
		 */
		
		boolean quiz= true;
		int score= 89;
		if(quiz==true) {
			System.out.println(" Good Job you tried to do quiz!!!");
			if (score>=90) {
				System.out.println(" You Got n A");
			}else if (score>80) {
				System.out.println(" You Got a B");
			}else {
			System.out.println(" Not Good !!!");
		}
		}else {
			System.out.println(" You Should Study More");
		}
	}
}
