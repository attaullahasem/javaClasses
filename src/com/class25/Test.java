package com.class25;

public class Test {

	public static void main(String[] args) {
		System.out.println("Create an object of a Employee class");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
	
		System.out.println("Create an object of a Scrum class");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog, Sprint Backlog";
		sm.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		sm.attendScrumMeetings();
		
		Developer dev=new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		
		dev.employeeId=101;
		// dev.employeeSsn; will not be accessible because it is private
		
	}
}
