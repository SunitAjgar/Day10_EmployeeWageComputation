package com.blz;

public class EmpWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Employee emp = new Employee();
		String str = emp.employeeAttendance();
		System.out.println(str);
		emp.checkEmpWage(str);
		Company ref1 = new Company("Netflix", 25, 30, 8);
		Company ref2 = new Company("Amazon", 30, 30, 8);
		Company ref3 = new Company("Atlassian", 35, 30, 8);
	}
}
