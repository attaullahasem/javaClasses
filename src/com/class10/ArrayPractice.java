package com.class10;

public class ArrayPractice {

	public static void main(String[] args) {
		// TASK1
		//create an array of chars and store grades into it A,b,c,D,E. then print a grade (use 2)
		//different methods
		
		char [] grades= {'A', 'B','C','D','E'};
		System.out.println(grades[2]);
		System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
		char [] gradesScore = new char [5];
		gradesScore[0]='A';
		gradesScore[1]='B';
		gradesScore[2]='C';
		gradesScore[3]='D';
		gradesScore[4]='E';
		
		System.out.println(gradesScore[1]);
		// TASK2
		//create an array of names  and store names of your group. then print your names from that array.
		//( 2 different ways)
		
		String [] groupNames= { "Asim", "Junaid", "Daniz","David", "KD"};
		System.out.println(groupNames[0]);
		System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
		
		String [] groupNames1= new String[5];
		 groupNames1[0]="Asim";
		 groupNames1[1]="Junaid";
		 groupNames1[2]="Daniz";
		 groupNames1[3]="David";
		 groupNames1[4]="KD";
		System.out.println(groupNames1[0]);
		
		System.out.println("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
		//TASK3
		//Create an array of words: JAVA, Saturday, day, coding, is. 
		//Print the follwoing sentences using element f array:
		// "Saturday is Java coding Day"
		 //                  0        1           2            3        4
		
		String [] words= {" JAVA ", " Saturday ", " day ", " coding ", " is "};
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);
		
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		// 2nd way
		String[] day=new String[5];
        day[0]=" Java";
        day[1]="Saturday";
        day[2]="day";
        day[3]="coding";
        day[4]="is";
        System.out.println(day[1 ]+" "+day[4]+" " +day[0]+ " " + day[3]+ " "+ day[2]);
		}
	}


