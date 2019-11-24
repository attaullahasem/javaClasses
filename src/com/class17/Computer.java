package com.class17;

public class Computer {

	
	// define attributes/features
	    
	    String brand, name,make;
	    int screen, monitor, ram, memory;
	    boolean mouse, keyboard;
	    
	    void watchmovie() {
	        System.out.println(" I watch movie on my " + name);
	    }
	    
	    void javacoding() {
	        System.out.println(" I am doing java coding on my "+ name);
	    }
	    
	    public static void main(String[] args) {
	        Computer computer1=new Computer();
	        computer1.make="Apple";
	        computer1.name="Mac Pro";
	        computer1.brand="mac";
	        computer1.screen=17;
	        computer1.ram=250;
	        computer1.memory=16;
	        computer1.mouse=true;
	        computer1.keyboard=true;
	        computer1.keyboard=false;
	        // want to print Mac Pro Apple computer with ram250
	    
	        System.out.println(computer1.name + " have "+ computer1.make + " with "+ computer1.ram);
	        
	        computer1.javacoding();
	        computer1.watchmovie();
	        
	        System.out.println(".........Creating 2 objects of a computer type.........................");
	        
	        Computer computer2=new Computer();
	        computer2.make="Dell";
	        computer2.name="420";
	        computer2.memory=125;
	        computer2.mouse=true;
	        computer2.keyboard=true;
	        computer2.keyboard=false;
	        
	        computer2.javacoding();
	        computer2.watchmovie();
	        
	        System.out.println(computer2.name + " have "+ computer2.make + " with "+ computer2.ram);
	    }
	}
	
