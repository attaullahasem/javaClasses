package com.class19;

public class Task {
public static void main(String[] args) {
	
Task email=new Task();
email.name="John";
email.lastName="snow";
email.emailtype="@gmail";
email.createEmail();
	
		// create a method createEmail(). based on provided user name, lastName and email type,
		// your method should return complete email Address. Example:johnsnow@gmail.com or
		// johnsnow@yahoo.com
}
	String name, lastName, emailtype;
	
		void createEmail() {
			
			System.out.println(name+lastName +emailtype);
				
		}

	}


