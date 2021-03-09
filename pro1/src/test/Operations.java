package test;

import java.util.Scanner;

public class Operations extends Employee {
	Scanner sc=new Scanner(System.in);
    public boolean add(int i, Employee arr[],int salary,int check) throws WrongSalaryException {
    	
    	boolean status=false;
    	if(check<3 && salary<10000) {
    		arr[i].setSalary(salary);
    		status=true;
    	}
    	else if(check>3 && salary>=10000) {
    		arr[i].setSalary(salary);
    		status=true;
    	}
    	else {
    		status=false;
    		throw new WrongSalaryException(salary);
    	}
    	
    	return status;
    	
    }
    
}
