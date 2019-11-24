package com.class07;

public class Task {
	public static void main(String[] args) {

		/*
		 * create a boolean variable workDay and assign True create int variable and
		 * assign it to 1 as long as it is workDay print" I need a day off" and increase
		 * day by 1 once day is 6 print " I do not need a day off any more"
		 */

		boolean workDay = true;
		int day = 1;
		while (workDay) {
			
			if (day == 6) {
				System.out.println("I do not need a day off any more");
				workDay=false;
			}else {
				System.out.println(" I need a day off");
			}
			day++;
		}
	}
}
