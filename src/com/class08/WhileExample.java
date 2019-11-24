package com.class08;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		
/*lets ask user to Enter if it is raining or not(true or false)
 * as long as there is rain, lets keep asking
 * as soon there is no rain, we can go to the park
 */
		
	Scanner scan=new Scanner(System.in);
	boolean isRain;
	do {
		System.out.println(" Is it raining?");
		isRain=scan.nextBoolean();
		
	}while (isRain);
		System.out.println(" Go to the park");
		
	}

}
