package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		//  7 days a week
		// if day is  2 or 4---- we have SDLC Class
		//if day is  6 or 7---- we have JAVA class
		//if day is  1 or 5---- we have NO Class
		// if day ==3 review Class
int day=6;
// false OR false----false
if(day==2 || day==4) {
	System.out.println("we have SDLC Class ");
	
	// true OR false-----true
}else if (day==6 || day==7) {
	System.out.println("we have SDLC Java");
	
	// false OR false----false
}else if (day==1 || day==5) {
	System.out.println(" No Class");
}
		
//7 days a week
	// if day is  Tuesday or Thursday---- we have SDLC Class
	//if day is  Saturday or Sunday---- we have JAVA class
	//if day is  Monday or Friday---- we have NO Class
	// if day  is Wednesday -----review Class	
		
		String weekDay="Sunday";
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")){
			System.out.println(" SDLC Classs");
			
		}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")){
		System.out.println(" Java Class");
		
	}else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
		System.out.println("No Class");
		
	}else if (weekDay.contentEquals("Wednesday")) {
		System.out.println("Review Class");
		
	}else {
		System.out.println(" Not a valid day");
	}
	}
}
