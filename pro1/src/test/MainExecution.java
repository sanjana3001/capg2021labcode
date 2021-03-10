package test;

import lab4.EmployeeService;

public class MainExecution {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		String deptid[]= service.getEmployeeCodes();		
		int dept1=0, dept2=0,dept3=0;		
		for (String empid : deptid) {
			//System.out.println(empid);
			 switch(empid){
	              case "001":
	            	  ++dept1;
	            	  break;
	              case "002":
	            	  ++dept2;
	            	  break;
	              case "003":
	            	  ++dept3;
	            	  break;
	             
			 }  
	}    System.out.println("dept"+"   dept no"+" count");
		 System.out.println("dept 1: 001=   "+dept1);
		 System.out.println("dept 2: 002=   "+dept2);
		 System.out.println("dept 3: 003=   "+dept3);

	}
	}


