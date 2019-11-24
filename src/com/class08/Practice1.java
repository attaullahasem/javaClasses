package com.class08;

public class Practice1 {
public static void main(String[] args) {
	int sum=0;
	for (int i=1; i<=5; i++){
		sum=sum+i;
		System.out.print(sum+ "+");
	
	}
	System.out.println();
	System.out.println(sum);//
	
	System.out.println("********************************");
	// what is the out put\
	int sumAll=0;
	for ( int i=0; i<=20; i+=5) { // 0,5,15,20
		sumAll=sumAll+i;
	}
	System.out.println(sumAll);
	
	// // what is the out put
	
	int total=2;
	for( int y=1; y<=3; y++) {
		total=total*y;// 2=1*2; 4=2*2; 12=4*3
	}
	System.out.println(total);
	
	// 
}
}
