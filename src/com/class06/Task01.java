package com.class06;

import java.util.Scanner;

public class Task01 {
public static void main(String[] args) {
	/* ask user to enter boolean value for sale
	 * if there is no sale ---- I am not shopping
	 * if there is sale----Check the price of item
	 * based on the amount we will have to calculate the price
	 * after discount
	 * if price <20 ----apply 10% discount
	 * if price between 20-100 ---- apply 20% discount
	 * if price between 100-500----apply 30% discount
	 * anything else ----apply 50% discount
	 * After discount the price of the item reduce from ------to -----
	 * 
	 */
	Scanner inp=new Scanner(System.in);
	System.out.println(" Do you have Sale");
	boolean sale= inp.nextBoolean();
	double price;
	double discount;
	double finalPrice;
	
	
	if (!sale) {
		System.out.println(" I ma not going for shopping");
	} else {
		System.out.println(" What is the actual price");
		price=inp.nextDouble();
		if (price<20) {
			discount=price*0.1;
			//finalPrice=price-discount;
			
		}else if (price>=20 && price<100) {
			discount=price*0.2;
			//finalPrice=price-discount;
		}else if(price>=10 && price<500) {
			discount=price*0.3;
			//finalPrice=price-discount;
		}else {
			discount=price*0.5;
		}
		
		finalPrice=price-discount;

	System.out.println(" After discount " + discount+ " the price of the item reduce from " 
	+ price + " to "+ finalPrice);
}
}
}
