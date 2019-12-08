package com.class26;

public class EmployeeTest {
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.salary=80000;
	emp.getpaid();
	
	FullTime ft=new FullTime();
	ft.salary=90000;
	ft.bonus=10000;
	ft.getPaid();
}
}
