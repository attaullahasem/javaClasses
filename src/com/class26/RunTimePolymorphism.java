package com.class26;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// creating an object of parent class
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		
		
	// creating an object of child class
		
		Cat cat=new Cat();
		cat.eat();// from parent
		cat.meow();// from child/cat//from parent
		cat.sleep();//from parent
		
		// widening
		double d=90;
		
// narrowing
		int i=(int)1.99;
		System.out.println("============================================");
		//Non Primitive Typecasting
		//widening --> creating an object of child classs and giving refrence to the parent class
		
		Animal obj=new Cat();
		obj.eat(); // coming from parents
		obj.sleep();/// this method will come form child class--> iis called rumtime polymorphism
	//	obj.meow();// compilr error ----> this will not be available
		
	}

}
