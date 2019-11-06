package com.class9;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
	
//      Write a guessing game where the user has to guess
//		a secret number between 1 and 20. After every guess
//		input, the program tells the user whether their number
//		was too large or too small. The program will keep
//		asking the user to enter the number until he finds
//		 the correct number. When the correct answer is found
//		 the system should display “Congratulations!!.
//		You got it!”
		
		int g =32;
		   for(int i=0;i<5;i++) {
		       Scanner scan =new Scanner(System.in);
		      System.out.println("Guess the number");
		      int a= scan.nextInt();
		      if (a<g) {
		          System.out.println("too small");
		          i=1;
		      }
		      else if (a>g) {
		          System.out.println("too large");
		          i=1;
		      }
		      else if(a==g){
		          System.out.println("Congratulations!!. You got it!");
		      }
		   }
		
	}

}
