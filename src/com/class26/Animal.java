package com.class26;

public class Animal {

	public void sleep(){
		System.out.println("animal sleep");
		
	}
	public void eat() {
		System.out.println("Animal eat");
	}
}
class Cat extends Animal{
	public void sleep() {
		System.out.println("Cat slee all day");
	}
	public void meow() {
		System.out.println(" I meow when I am hungry");
	}
}
