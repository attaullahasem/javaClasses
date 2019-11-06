package com.class13;

import java.util.Scanner;

public class TASK1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter your class day::");
		
		String day=scanner.nextLine();
		// here we use .equals
		// we can use 2 or 3 commands at same time such as
		// if(day.trim().toLowerCase().equals
if (day.equals("Saturday")) {
	System.out.println("Saturday is your Java classs");
}else if (day.equals("sunday")) {
	System.out.println("Sunday is your GIT class");
}else if(day.equals("Tuesday")) {
	System.out.println("Tuesday is your SDLC class");
}else if(day.equals("thursday")) {
	System.out.println("Thursday is your Maunal Testing class");
}else {
	System.out.println(" Envalid Entry!! Please enter a vvalid class day");
}
scanner.close();


//Scanner scanner=new Scanner(System.in);
//
//System.out.print(“Enter your class day:: “);
//String day=scanner.nextLine();
//String day1=day.toLowerCase();
//
//
//if(day.trim().toLowerCase().equals(“saturday”)) {
//    System.out.println(“Saturday is your Java Class”);
//}else if(day.toLowerCase().equals(“sunday”)) {
//    System.out.println(“Sunday is your Git Class”);
//}else if(day.trim().toUpperCase().equals(“TUSEDAY”)) {
//    System.out.println(“Tuseday is your SDLC class”);
//}else if(day.trim().toLowerCase().equals(“thursday”)) {
//    System.out.println(“Thursday is your Manual Testig class”);
//}else {
//    System.err.println(“Envalid Entry!! Please enter a valid class day”);
//}
//scanner.close();
	}

}
