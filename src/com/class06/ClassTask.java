package com.class06;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {

		/*
		 * ask user to enter the month they were born based on the month define the
		 * season 
		 * if user is born in Jan, feb and dec----winter 
		 * if born in march, April, May-----spring 
		 * if born in june, july, August----summer 
		 * if in Sept, Octo and Nove---falls 
		 * otherwise its ----unknown 
		 * at the end of program" you were born in-------"
		 */
		String month = null;
		Scanner scan=new Scanner(System.in);
		System.out.println("Which month were you born");
		month=scan.nextLine();
		
		String seasonOfYr;
		
		if (month.equals("January") || month.equals("February") || month.equals("December")) {
			seasonOfYr = "Winter";
			
		}else if (month.equals("March") || month.equals("April") || month.equals("May")) {
				seasonOfYr = "Spring";
				
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
					seasonOfYr = "Summer";
					
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
						seasonOfYr = "Falls";
						
					}else {
						seasonOfYr="Unkown";
					}
				System.out.println(" You  were born in season of " + seasonOfYr);
	}
}
