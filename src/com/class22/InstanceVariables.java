package com.class22;

public class InstanceVariables {
	// any variable inside the class is called instance variable,
	//unless it has a word static, any object inside the class can access it.
	
String name="Samir";
    
    public static void main(String[] args) {
        
        String name="Burcu";
        System.out.println(name);
        
        InstanceVariables obj=new InstanceVariables();
        System.out.println(obj.name);
        //changing value of the instance variable
        obj.name="John";
        System.out.println(obj.name);
        //value will be Samir
        InstanceVariables obj1=new InstanceVariables();
        System.out.println(obj1.name);
    }
}
