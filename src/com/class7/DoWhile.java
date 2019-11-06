package com.class7;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mostly used
				int num=10;
				while(num<=7) {
					System.out.println("Hello");
					num++;
				}
				//rare
				int num1=10;
				do {
					System.out.println("Bye");
					num1++;
				}while(num1<=7);
				
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
				//print even numbers from 20 to 50 using do while
				//First way:
				int even=20;
				do {
					System.out.println(even);
					even+=2;
				
				}while (even<=50);
				System.out.println("===========Secondway========================================");
				//Second way:
				
				int even1=20;
				do {
					if (even1%2==0) {
						System.out.println(even1);
						even1++;
					}
			
				}while (even1<=49);
				}
					
				}
