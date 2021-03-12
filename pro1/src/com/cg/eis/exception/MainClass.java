package com.cg.eis.exception;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeException v= new EmployeeException();
		boolean result=false;
		System.out.println(" enter the salary");
		int salary=sc.nextInt();
		
		try {
			result=v.ValidateSalary( salary);
		} catch (SalaryValidationException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		if(result==true) {
			System.out.println(" salary added successfully");
		}
		else if(result==false) {
			System.out.println(" unsuccessful attempt");
		}
		
	}

}
