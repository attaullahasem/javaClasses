package com.class02;

public class ArithematicOperations {
/*
 * declare two variables and initialize them
 * display result of addition, subtraction, multiplication and division
 */
	public static void main(String[] args) {
		
	int num1, num2;
	num1= 20;
	num2=10;
	
	System.out.println(num1+num2); // 30
	System.out.println(num1-num2); // 10
	System.out.println(num1*num2); //200
	System.out.println(num1/num2);// 2
		
	// Question: how can we print value of num1 and num2 together, it will show 20,10
	// ans: add "," in the middle of both numbers then it will print 20,10, if you dont want , then remove comma 
	//from double quotes, then it will show a SPACE between both nubers such as 20 10
	
	
	System.out.println(num1+","+num2);
	
	int sum=num1+num2;
	int sub=num1-num2;
	int mult=num1*num2;
	int divi=num1/num2;
	// the addition of 2 numbers is 
	System.out.println(sum);
	System.out.println(sub);
	System.out.println(mult);
	System.out.println(divi);
	
	// the addition of 2 numbers is 30
	// the subtraction of 2 numbers is 10
	// the multiplication of 2 numbers is 200
	// the division of 2 numbers is 2
	
	System.out.println("the addition of 2 numbers is " + sum);// the addition of 2 numbers is 30
	System.out.println("the subtraction of 2 numbers is " + sub);// the subtraction of 2 numbers 10
	System.out.println("the multiplication of 2 numbers is " + 200);// the multiplication of 2 numbers is 200
	System.out.println("the division of 2 numbers is " + 2);// the division of 2 numbers is 2
	
	//Home practice: Write a Java program 
	//to add, subtract, multiply and divide 2 decimal values. Your program should say. 
	//“The _______ of 2 numbers ___ and ___ is equal to _____”
	
	double a1= 12.5;
	double b1=3.5;
	char grade='A';
	
	double sum1= a1+b1;//16
	double sub1=a1-b1;//9
	double mult1=a1*b1;//43.75
	double divi1=a1/b1;//3.57
	System.out.println(sum1);
	System.out.println(sub1);
	System.out.println(mult1);
	System.out.println(divi1);
	System.out.println("The sum of 2 numbers "+ a1 +" and "+b1+" is equal to "+sum1);
	
	// Exercise:  Write a program to find the square of the number 3.9. You program should say “The square
	//of the__ is ____, which is A
	
	double a2=3.9;
	double a2sq=a2*a2;
	System.out.println("The square of the "+a2 + " is "+a2sq +"which is "+'A');
	
	
	// Exercise 2: Write a program to print the area and  parameter of a rectangle  with width = 5 and 
	// height = 8. Your program should say. “The parameter of rectangle with width ___ and height ____ 
	//is equal to _____and the area is __”
	
	int w=5;
	int l= 8;
	int pert= (w*l)*2;
	System.out.println("The perimeter of rectangle with width "+w+" and height "+l+"is equal to "+pert);
	
			
	
	}
	
	
}
