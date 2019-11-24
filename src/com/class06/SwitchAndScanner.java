package com.class06;

import java.util.Scanner;

public class SwitchAndScanner {
public static void main(String[] args) {
	/*ask user to enter their gender F or M
	 * based on the input provide
	 * if F----Female
	 * If M----Male
	 * otherwise the gender is --unknown
	 */
	Scanner scan=new Scanner(System.in);
	System.out.println(" Plese enter your gender: F or M");
	char gender=scan.next().charAt(0);
	String userGender;
	// works only with byte,int,short,string and char
	// no relational operational operators (<,>, >= , <=) can be used
	switch (gender) {
	case'F':
		userGender="Female";
		break;
	case'M':
		userGender="Male";
		break;
		default:
			userGender="Unknwon";	
	}
	System.out.println("Your gender us is" + userGender);
}
}
