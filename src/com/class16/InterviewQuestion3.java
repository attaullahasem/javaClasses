package com.class16;

public class InterviewQuestion3 {

	public static void main(String[] args) {
		//Interview Question No.3
		
		//Find out how many alpha characters present in a string?  
		 
String str= " Hello 6876868 *&^^, welcomeegyggiuging !!!!";

str= str.replaceAll("[^a-nA-N]", "");// ^ means NOT, it will leave uppercase and lower case characters and will remove everything else

System.out.println(str);
	}

}
