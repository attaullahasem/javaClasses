package com.class28;

public class Child extends Parent {

	String name = "James";

	public void callName() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(lastName);
	}

	public void callingMethod() {
		this.callName();// by default this is added--so we are
		// calling current class method
		super.callName();
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.callName();
	}
}
// when we are using term SUPER we are calling PARENT class Constructor
// when we are using THIS we are calling CURRENT class variables