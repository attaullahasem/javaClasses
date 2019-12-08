package com.class31;

interface Marks {
	//Task2
//	We have to calculate the percentage of marks obtained in three 
//	subjects (each out of 100) by student A and in four subjects 
//	(each out of 100) by student B. Create class ‘Marks’ with an
//	abstract method ‘getPercentage’. It is inherited by 
	
		double getPercetatge();
	}
	 class A implements Marks{
		 double percentage;
		  double marks;
		 A(double marks, double marks1, double marks2){
			 this.marks=marks;
		 }
	A(double marks, double marks1, double marks2, double marks3){
			 this.marks=marks;
		 }
		@Override
		public double getPercetatge() {
			double average = (marks+marks+marks)/3;
			System.out.println(average);
			return average;
		}
		}
	 class B extends A implements Marks{
		B(double marks, double marks1, double marks2, double marks3) {
			super(marks, marks1, marks2,marks3);
			this.marks=marks;
		}
		public double getPercetatge() {
			double average = (marks+marks+marks+ marks)/4;
			System.out.println(average);
			return average;
	 }
	 }