package com.class03;

public class IfConditionTask2 {

	public static void main(String[] args) {
	
		double a= 24.5;
		double b= 10.5;
		
		if(a>b) {
			System.out.println("Double value 24.5 is larger than 10.5");
			
		}else {
			System.out.println("..................");
		}
			
			System.out.println("+++++++++++++++++++++");
	
		
		
			int tempCheck=32;
			
			if(tempCheck<32) {
				System.out.println("Water will freez with temperature 32");
			} else {
				System.out.println("Water will NOT freez with temperature 32");
			}
			
			boolean val=false;
			if (val) {
				System.out.println("Hellow");
			}else {
				System.out.println("Bye");
			}
			boolean isRain= true;
			//if is raining i will take umbrella, otherwise i go for a walk
			if(isRain) {// is Rain==true
				System.out.println("I wil take umbrella");
			}else {
				System.out.println(" i will go for a walk");
			}
		}
	
}
