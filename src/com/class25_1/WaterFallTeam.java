package com.class25_1;

import com.class25.Employee;

public class WaterFallTeam extends Employee{

	public static void main(String[] args) {
		// we want to create relation ship b/w WaterFallTeam and Employee class

		WaterFallTeam team=new WaterFallTeam();
		team.companyName="Syntax";
		// accessing protected variable in different packages
		team.employeeId=102;
		
	}

}
