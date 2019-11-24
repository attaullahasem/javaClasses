package com.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		// break keyword breaks/ exit the loop and will stop on that specicif number

		for (int i = 10; i < 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println(i);
		}
		

//Continue; it will skip CURRENT iteration

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println(" I am outside of loop");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		for (int i = 1; i <= 5; i++) {
			if (i == 3 || i==4) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println(" I am outside of loop");
		System.out.println("////////////////////////////////////////////////////////");
		// i want to print numbers from 1 t0 20
		
		for (int a=1; a<=20; a++) {
			if(a==5|| a==6 || a==7) {
				continue;
			}
			System.out.println(a);
		}
		// Or this way
		for (int a=1; a<=20; a++) {
			if(a>=5|| a<=7) {
				continue;
			}
			System.out.println(a);
	}
	}
}
