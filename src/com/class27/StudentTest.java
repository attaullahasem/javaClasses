package com.class27;

public class StudentTest {

	public static void main(String[] args) {
		Student obj=new SyntaxStudent();
		
		Student obj1=new collegeStudent();
		
		Student obj2=new collegeStudent();

		Student obj3=new SchoolStudent();
		
		obj.attendance();
		obj1.attendance();
		obj2.attendance();
	}

}
