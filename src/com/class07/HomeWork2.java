package com.class07;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
/*Ask user to pay for coffee
 * You need to keep asking user to pay for it entered price is =5;
 * After user paid then say " Enjoy your coffee"
 */
		Scanner scan=new Scanner(System.in);
		int price=5;
		
		while(price<=5) {
		System.out.println(" Please pay for coffee");
		price=scan.nextInt();
		price++;
		
			
			
		}
		System.out.println(" Thanks you and enjoy your coffee");
		
		//
		
		}
	
	}

