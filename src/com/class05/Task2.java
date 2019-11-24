package com.class05;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task1
				// Write a program that will print wether
				// it is a weekend or weekday. If any day
				// from 1-4---out put " it is a weekday, any
				// from 6-7--- out put: it is a weekend", any
				// other day--- out" Invalid day"

				int weekDay=1;
				
				if (weekDay==1 || weekDay==4){
					System.out.println("it is a week day");
				}else if (weekDay==6 || weekDay==7){
					System.out.println(" it is a weekend");
				}else {
					System.out.println(" Invalid day");
				}
	}

}
