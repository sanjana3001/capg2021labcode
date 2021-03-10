package com.capg.empapp.execptions;

public class WrongSalaryException extends Exception {
 private int salary;
 
     
     public WrongSalaryException() {
	super();
	// TODO Auto-generated constructor stub
}

	public WrongSalaryException(int salary) {
    	 this.salary=salary;
     }
     
     public String toString()
 	{
 		return "WrongSalaryException";
 	}

}
