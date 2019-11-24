package com.class02;

public class Task2 {

	public static void main(String[] args) {
		
		//Task 1
		double x, y;
		x= 5.5;
		y=4.5;
		double sum=x+y;// 10
		double sub=x-y; //1
		double mul=x*y;//
		double divi=x/y;//
		
			System.out.println("the sum of 2 numbers " + x + "and" + y + " is euqal to " + sum);
			
		//	Task 2:
			//write a program to find the square of the number 3.9. Your program should say "the square of---- and --"
					
		double num1, num2;
		num1=3.9;
		num2=3.9;
		double square=num1*num2;// 15.21
		
		System.out.println( "the square of " + num1 + " is equal to "+square);
		
			
			
			// Task 3:
			// write a program to print the area of perimeter of a rectangle with width=5 and height = 8
			// your program should say " the perimeter of a rectangle with width --- and height --- is equal to --- and 
			/// the are is ---"
			
		
	int width= 5;
	int height=8;
	int area= width*height;
	int perimeter=2*(width+height);
	System.out.println(" the perimeter of a rectangle with width " + width + " and height "+ height + " is equal to" + perimeter+" and the area is" +area);
			
	
	
	String a1="*";
    String a2="**";  
    String a3="***";
    String a4="##";
    String a5="#";
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    System.out.println(a4);
    System.out.println(a5);
			
    String FirstName;
    String LastName;
    
    FirstName="John";
    LastName="Smith";
    
    System.out.print(FirstName);
    System.out.print(LastName);
    //
    
    String aa="Java";
    String bb="programming language";
    
    System.out.println("aa "+"is #1 "+"bb");
    
    //
    double ed=8.2;
    double edsq=ed*ed;
    System.out.println("The multiplication of "+ ed + " value with itself is equal to"+edsq);
    
    //
    int w=5;
    int h=8;
    int p=(w+h)*2;
    int ar=w*h;
    System.out.println("The perimeter of a rectangle wiht width"+w+"and height"+h+"is equal to"+p+"and the area equals to"+ar);
     
    //
    
    int numa = 3;
    int numb = 7;
    int numc = 5;
    int numd = 1;
    
    System.out.println(numa+numb);// 10
    System.out.println(numa+numb/numc);//2
  System.out.println(numa+(numb/numc)-numd);//1
    
   //
  
  int myNumber= 6;
  int oneStep= myNumber*myNumber;//6*6;
  int stepTwo= (myNumber*myNumber)+ myNumber;//(6*6)+6;
  int stepThree= (myNumber*myNumber)+ myNumber/myNumber;//(6*6)+6/6;
  int stepFour= (myNumber*myNumber)+ myNumber/myNumber+17; //(6*6)+6/6+17;
  int stepFive= (myNumber*myNumber)+ myNumber/myNumber+17-myNumber; //(6*6)+6/6+17-6;
  int stepSix= (myNumber*myNumber)+ myNumber/myNumber+17-myNumber/myNumber;//(6*6)+6/6+17-6/6;
  
  System.out.println(myNumber*myNumber+ myNumber/myNumber+17-myNumber/myNumber);
  
  //
  
  
  int numx = 5;
  int numy = 4;
  int numz = 3;
  
  int num4 = 7; 
  int num5 = 10;
  int num6 = 5;
  
  int result1 ;
  int result2 ;
  result1= numx+numy-numz;
  
  System.out.println(numx+numy-numz);
  
    
  System.out.println(14%2);

  
	}
}
