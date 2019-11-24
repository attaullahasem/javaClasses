package com.class08;

public class ForLoop {

	public static void main(String[] args) {
		// Say Good Morning 5 times
		// initialize test condition increment
	
		for (int i=0; i<=4; i++) {
			System.out.println("Good Morning");
		}
		
		// print numbers from 1 to 10
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		// print number form 10 to 1
		
		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}
		//
		for (int i=0; i<=50; i+=5) {
			
System.out.println(i);//5,10,15,20,25,30,35,40,50

		}
		// TASK 1 print numbers form 1 to 100 in one line
		
		for (int i=1; i<=100; i++) {
			System.out.print(i+ ",");
		}
		System.out.println("========================================");
		//TASK 2 print numbers form 100 to 1
		
		for ( int i=100; i>=1; i--) {
			System.out.print(i+",");
		}
		System.out.println("/////////////////////////////////////////");
		// TASK 3print even numbers form 20 to 1(2 ways)
		
		for ( int i=20; i>=1; i-=2) {
			System.out.print(i+ ",");
	}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		// TASK 4 print odd number between 20 and 50(2 ways)
		
		for (int i=21; i<=50; i+=2) {
			System.out.print(i+",");
		}
		
		// 2nd way
		for (int i=20; i<=50; i++) {
			System.out.print(i+",");
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}
}
