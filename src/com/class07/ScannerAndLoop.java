package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*ask user to enter name 5 times
 * and our output should be "Good Afternoo________"
 * 
 */
		
		Scanner scan=new Scanner(System.in);
		int i=5;
		while(i<=5) {
		System.out.println(" please enter your name");
		String name= scan.nextLine();
	
		System.out.println(" Good Afternoon "+ name);
		i++;
		
	}
	}
}
