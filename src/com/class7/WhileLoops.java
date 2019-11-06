package com.class7;

public class WhileLoops {
public static void main(String[] args) {
	// how to print numbers from 1 to 20 
	
	int i=1;
	while (i<=20) {
		System.out.println(i);
		i++;
		
	}
	// i want to print numbers from 10 to 30 all in one line
	
	int y=10;
	while(y<=30) {
		System.out.print(y);
		
		y++;
		
	}
	
	// how to priint values from 10 t0 1
	
	int a=10;
	while (a>1) {
		System.out.println(a);
		a--;
	}
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
	// print values from 50 t0 20
	
	int z=50;
	
	while( z>=20) {
		System.out.println(z);
		z--;
	}
	// i want to print all even numbers from 1 to 20
	
	// we can do it by two ways
	// first; increment the value of w by 2(i.e +2)
	// second way is , to use %
	
	int w=2;
	while (w<=20) {
		System.out.println(w);
		w+=2;	
	}
	System.out.println("???????????????????????????????????????????????????????");
	// by using modulus
	int q=1;
	while(q>=20) {
		if (q%2==0) {
			System.out.println(q);
		}
		q++;
	}
	System.out.println("///////////////////////////////////////////////////////////////////////");
	// print only odd numbers from 50 to 100
	// print only even numbers form 100 to 1
	
	int m=50;
	
	while(m<=100) {
		
			System.out.println(m);
			if (m%2==0)
				System.out.println(m);
			m++;
		}
	m++;
	}
}

