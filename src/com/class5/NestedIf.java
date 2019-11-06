package com.class5;

public class NestedIf {
public static void main(String[] args) {
	
	boolean isDisplayed=true;
	String buttonText="Sign In";
	
	if (isDisplayed) {
		System.out.println("Button is displayed");
		if (buttonText.equals("Sign In")) {
			System.out.println(" Test case pass");
		}else {
			System.out.println(" Wrong tesxt is displayed");
		}
	}else {
		System.out.println(" Button is not displayed");
	}
	
}
}
