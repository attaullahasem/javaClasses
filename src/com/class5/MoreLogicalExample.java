package com.class5;
// to import short cut is ctr+shift+o
import java.util.Scanner;

public class MoreLogicalExample {

	public static void main(String[] args) {
		/*
		*/
		Scanner scan;
		double salesAmount;
		double commission;

		scan=new Scanner(System.in);
		System.out.println("Please enter you sales amount");
		salesAmount=scan.nextDouble();

		    if (salesAmount>=1 && salesAmount<100) {
		//lets give user 10% commission of a sale

		    commission=salesAmount*0.1;

		} else if (salesAmount >=100 && salesAmount <200) {
		//lets give user 20% commission of a sale

		    commission =salesAmount*0.2;

		} else if (salesAmount >=200 && salesAmount<500) {
		//lets give user 30% commission of a sale

		    commission =salesAmount*0.3;

		    } else if (salesAmount>=500) {

		//lets give user 50% commission of a sale

		    commission =salesAmount*0.5;

		} else {
		commission=0;
		}
		System.out.println("Based on the sales your commission is "+commission);
		}
		}
