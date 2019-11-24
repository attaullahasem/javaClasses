package com.class06;

public class Recap05 {
public static void main(String[] args) {
	/*declare then time (1-24)
	 * based on the time identify whether it is morning,
	 *  afternoon, evening or night
	 *  if 1-11---morning
	 *  if 12-3----noon
	 *  if 4-8-----evening
	 *  if >20----night
	 */
	
	int time=20;
	String timeOfDay=null;
	if(time>=1 && time<=11) {
		timeOfDay="Morning";	
	}else if (time>=12 && time<=15) {
		timeOfDay="Noon";
	}else if (time>=16 && time<=20) {
		timeOfDay="Evening";	
	}else if (time>20) {
		timeOfDay="Night";
		
	}else {
		timeOfDay="Invalid";
	}
	System.out.println("Time of the day is" + timeOfDay);
}
}
