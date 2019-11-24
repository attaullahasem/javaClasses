package com.class03;

public class ifElseif {
	public static void main(String[] args) {
		int num1=100;
		int num2=90;
		
		if (num1>num2) {
			System.out.println(" Num1 is larger than num2");
		}else if(num1==num2) {
			System.out.println("Num1 is equal to Num2");
			// we have to put all possible else if and then at the end we should have else
		}else {
			System.out.println("Num1 is smaller than Num2");
		}
		
		int day=6;
		if (day==1) {
			System.out.println("Today is Monday. I have to go for work");
		}else if (day==2) {
			System.out.println("Today is Tuesday. I have SDLC class");
		}else if (day==3) {
			
			System.out.println("Today is Wednesday. I have Review class");
		}else if (day==4) {
			System.out.println("Today is Thursday. I have SDLC Review class");
		}else if (day==5) {
			System.out.println("Today is Friday. Weekend");
		}else if (day==6) {
			System.out.println("Today is Saturday.My favorit coding day");
		}else if (day==7) {
			System.out.println("I love spending Sundays at Syntax");
		}else {
			System.out.println(" I do not know this day");
			
			// ctrl+shift+f----> for formrting the codes
		}
	}

}
