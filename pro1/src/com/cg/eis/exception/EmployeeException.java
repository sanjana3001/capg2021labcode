package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeException {
	public boolean ValidateSalary(int salary)throws SalaryValidationException {
		if(salary<3000) {
			
			throw new SalaryValidationException("invalid salary: "+salary);
		}
		return true;
		
	}

}
