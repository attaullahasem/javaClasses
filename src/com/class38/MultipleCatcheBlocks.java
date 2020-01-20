package com.class38;

public class MultipleCatcheBlocks {

	
	public static void division(int num1, int num2) {
		System.out.println();

		int result;

		try {
			result = num1 / num2;
			System.out.println(result);
			Thread.sleep(2000); // in order to be on safe side and 
			                   //no one interrupt our sleep we put 
			                   //it in try to catch the interruption.
		} catch (ArithmeticException e) {
			System.out.println("Please do not passs 0 as a second number");
		}catch(InterruptedException e) {
			System.out.println("Someone interrupted program sleep");
		}catch (Exception e) {
			System.out.println("Catching all types of exception");
		}
	}
	public static void main(String[] args) {
		division(12,0);
		division(12,2);
		
	}

}
