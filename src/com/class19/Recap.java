package com.class19;

public class Recap {
// let's add two numbers, so we have to declare two integers as parameters int num1 and int num2
	// this is method with parameters
	void sum(int num1, int num2) {
		int c = num1 + num2;
		System.out.println("The sum of 2 number is = " + c);
	}
	
//	void sum(int num1, int num2) {
//		int c = num1 + num2;
//		System.out.println("The sum of 2 number is = " + c);
//	}
	// create method to display hello 5 times
	void sayHello(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Hello");
		}
	}

	// create method to say smth # number of times
	void saySomething(String word, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(word);
		}
	}

	public static void main(String[] args) {
		Recap obj = new Recap();// this object which we created with variable of obj will work with all the methods 
		                        //we create above in the class, no matter how man we should just
		                        // write obj.method name such as obj.sum, obj.sayHello, 
		                        // or obj.saySomething etc
		obj.sum(10, 30);
		System.out.println("---------------");
		obj.sayHello(1);
		obj.saySomething("Good Morning", 3);
		//obj.saySomething(5, "Welcome");--> compiler will error because in the method 
		// above we have mention string first and then integer so we should follow same pattern
	}
}
