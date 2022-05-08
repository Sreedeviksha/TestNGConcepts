package com.testng.concepts;

import org.testng.annotations.Test;

public class Groups_Concept {

	@Test(groups = "Student Details")
	public void std_Details() {
		System.out.println("Student Id");
	}

	@Test(groups = "Student Details")
	public void std_Name() {
		System.out.println("Student Name");
	}

	@Test(groups = "Employee Details")
	public void emp_Details() {
		System.out.println("Employee Name");
	}

	@Test(groups = "Employee Details")
	public void emp_Salary() {
		System.out.println("Employee Salary");
	}

	@Test(groups = "Company Details")
	private void cmp_Name() {
		System.out.println("Company Name");
	}

	@Test(groups = "Company Details")
	private void cmp_Location() {
		System.out.println("Company Location");
	}
}
