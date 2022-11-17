package com.blz;

import java.util.Arrays;

public class EmpWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Employee emp = new Employee();
		String str = emp.employeeAttendance();
		System.out.println(str);
		emp.checkEmpWage(str);
		Company ref1 = new Company("Netflix", 25, 30, 8);
		System.out.println(ref1);
		Company ref2 = new Company("Amazon", 30, 30, 8);
		System.out.println(ref2);
		Company ref3 = new Company("Atlassian", 35, 30, 8);
		System.out.println(ref3);
		Company[] EmpWagearr = new Company[3];
		EmpWagearr[0] = ref1;
		EmpWagearr[1] = ref2;
		EmpWagearr[2] = ref3;
		System.out.println(Arrays.toString(EmpWagearr));
	}
}
