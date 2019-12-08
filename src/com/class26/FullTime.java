package com.class26;

public class FullTime extends Employee {

	int bonus;
	public void getPaid() { // this method is called overriding method
		System.out.println("Full time Employee gets paid"+ salary+" and bonus"+bonus);
	}
	
}
