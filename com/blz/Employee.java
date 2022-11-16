package com.blz;

import java.util.Random;

class Employee {

	private final int WAGE_PER_HRS = 20;
	private final int FULL_DAY_HRS = 8;
	private final int PART_TIME_HRS = 4;

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
		int fullDailyWage = WAGE_PER_HRS * FULL_DAY_HRS;
		System.out.println("The daily wage of a full time Employee is : " +fullDailyWage+ " $");
		
		case "Employee is present part time":
		int halfDailyWage = WAGE_PER_HRS * PART_TIME_HRS;
		System.out.println("The daily wage of a part time employee is : "+halfDailyWage+ " $");
		}
	}
}
