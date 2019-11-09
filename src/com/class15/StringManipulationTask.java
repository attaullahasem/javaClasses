package com.class15;

import java.util.Scanner;

public class StringManipulationTask {

	public static void main(String[] args) {
		// lets ask user to enter browser
		// based on the input we say " your selected browser is"-----------------

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter broowser name");
		
		String browser=scan.nextLine();
		// in order to avoid the mistake due to case sensitive we have to change to either lower case or upper case so
		//we add the .toLowerCase 
		switch(browser.toLowerCase()) {
		
		case "firefox":
			System.out.println("Execution be performed on"+ browser);
			break;
		case "chrome":
			System.out.println("Execution be performed on"+ browser);
			break;
		case "ie":
			System.out.println("Execution be performed on"+ browser);
			break;
		case "saffari":
			System.out.println("Execution be performed on"+ browser);
			break;
			default:
				System.out.println("Please enter valid browser");
			
			
			
		}
		
		
	}

}
