package com.cg.eis.exception;

public class SalaryValidationException extends Exception {

	int salary;

	public SalaryValidationException(int salary) {
		super();
		this.salary = salary;
	}

	public SalaryValidationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryValidationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public SalaryValidationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public SalaryValidationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public SalaryValidationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
