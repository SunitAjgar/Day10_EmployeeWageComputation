package com.blz;

import java.util.Random;

class Employee {

	private final int WagePerHrs = 20;
	private final int FullDayHrs = 8;

	public String employeeAttendance() {
		
		EmpWageComputation obj = new EmpWageComputation();
		Random random = new Random();
		int randomNum = random.nextInt(3);
		String result = switch (randomNum) {
		case 0 -> "Employee is present part time";
		case 1 -> "Employee is present full time";
		default -> "Employee is absent";
		};
		return result;

	}

	void checkEmpWage(String str) {
		
		switch (str) {
		
		case "Employee is present full time":
		int FullDailyWage = WagePerHrs * FullDayHrs;
		System.out.println("The daily wage of a full time Employee is : " + FullDailyWage + " $");
		}
	}
}
