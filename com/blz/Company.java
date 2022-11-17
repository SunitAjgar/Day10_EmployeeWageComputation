package com.blz;

class Company {
	
	private String companyName;
	private int WagePerHours;
	private int days;
	private int workingHrs;
	private int monthlyWage;
	private int dailyWage;

	public Company(String companyName, int WagePerHours, int days, int workingHrs) {
		
	this.companyName = companyName;
	this.WagePerHours = WagePerHours;
	this.days = days;
	this.workingHrs = workingHrs;
	EmpWageBuilder();
	}
	void EmpWageBuilder() {
		dailyWage = WagePerHours * workingHrs;
		monthlyWage = dailyWage * days;
		toString();
	}
	@Override
	public String toString() {
		return "companyName = " + companyName + ", WagePerHours = " + WagePerHours + ", days = " + days
				+ ", workingHrs = " + workingHrs + ", monthlyWage = " + monthlyWage + ", dailyWage = " + dailyWage + " ";

	}


}

