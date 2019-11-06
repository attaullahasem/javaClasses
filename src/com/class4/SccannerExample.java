package com.class4;

import java.util.Scanner;

public class SccannerExample {

	public static void main(String[] args) {
		
	/*scanner is class in java	that allow to take input from user
	 * scanner will help us to make our program more interractive
	 */
		
		 Scanner scan=new Scanner(System.in);// remember this line
		 System.out.println("Please enter any number");
		 
		 /* nextInt();----> for numbers
		  * nextLine();--->String
		  * nextDouble();---> double
		  * 
		  */
		int number=scan.nextInt();// remember this line
		System.out.println("Enter number is "+number);
		
		System.out.println("+++++++++++++++++++++++++++");
		
		Scanner input=new Scanner(System.in);
		System.out.println(" please enter your name");
		String name= input.nextLine();
		System.out.println(" Good afternoon "+name);
		
	}
}
