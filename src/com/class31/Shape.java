package com.class31;

	
	//Task 1
//	Create an Interface �Shape� with undefined methods as calculateArea 
//	and calculatePerimiter . Create 2 child classes: Circle & Square that
//	should have an implementation of area and perimeter calculation.
//	Test your code.
	
	public interface Shape {
		public double calculateParameter();
		public double calculateArea();
	}
	class Circle implements Shape{
		double radiis;
		double pi;
		Circle(double radiis, double pi){
		this.radiis=radiis;
		this.pi=pi;
		}
		@Override
		public double calculateParameter() {
			double circleArea= radiis* pi;
			System.out.println(circleArea);
			return circleArea;
		}
		@Override
		public double calculateArea() {
	double parameter= 2*radiis* pi;
			System.out.println(parameter);
			return parameter;
		}
	}
	class Square implements Shape{
	double side;
	Square(double side){
		this.side=side;
	}
		@Override
		public double calculateParameter() {
			double Parameter=4*side;
			System.out.println(Parameter);
			return Parameter;
		}
		@Override
		public double calculateArea() {
			double Area=side*side;
			System.out.println(Area);
			return Area;
		}
	}
