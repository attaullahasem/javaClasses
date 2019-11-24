package com.class04;

import java.util.Scanner;

public class ScannerTask1 {
	
public static void main(String[] args) {
	
	Scanner keyboard=new Scanner(System.in);
	
	System.out.println(" What is the amount of loan needed");
	
	int num1=keyboard.nextInt();
	
	if ( num1<200000) {
		System.out.println(" i will lend you the money");
	}else {
		System.out.println("i will not lend you the money");	
	}
	

	/*
	 * System.out.println("What is the amount of loan is needed");
    int num1=keyboard.nextInt();
    
    if(num1<200.000) {
        System.out.println(" i will lend you the money");
    }else {
        System.out.println("i will not lend you the money");
    }

	 */
}
}
