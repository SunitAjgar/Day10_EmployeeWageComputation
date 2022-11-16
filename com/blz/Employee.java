package com.blz;

import java.util.Random;

class Employee {
	public String employeeAttendance() {
		Random random = new Random();
		int randomNum = random.nextInt(3);
		String result = switch (randomNum) {
		case 0 -> "Employee is present part time";
		case 1 -> "Employee is present full time";
		default -> "Employee is absent";
		};
		return result;
	}
}
