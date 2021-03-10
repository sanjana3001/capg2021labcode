package com.capg.empapp.dao;


	import java.util.Scanner;

import com.capg.empapp.db.EmployeeDB;
	import com.capg.empapp.dto.Employee;
	import com.capg.empapp.execptions.InvalidEmployeeIdExcption;
	import com.capg.empapp.execptions.WrongSalaryException;

	public class EmployeeDAOImpl implements IEmployeeDAO {
         Scanner sc=new Scanner(System.in);
         int count=EmployeeDB.getCount();
         static Employee[] sal=new Employee[EmployeeDB.count];
		public boolean addEmployee(Employee e) throws WrongSalaryException{
	         // SQL  insert into employee ...... 
			
			//System.out.println(" =====>> DAO Impl employee "+e);
			return EmployeeDB.addEmployee(e);
		}

		public Employee[] getAllEmployees() {

			return EmployeeDB.employees;
		}
		
		//============================================================
		
		
		public boolean editSalaryByEmployeeId(int salary, int id) throws InvalidEmployeeIdExcption {
			Employee arr[] = getAllEmployees();
			int count=EmployeeDB.getCount();
			for(int i=0;i<count;i++) {
				if(arr[i].getEmployeeId()==id) {
					  
					  arr[i].setSalary(salary);
					  return true; 	
					 
				}
				 
			}
			return false;
			
		}

		public boolean editExpByEmployeeId(int exp,int id) throws InvalidEmployeeIdExcption {
			Employee arr[] = getAllEmployees();
			int count=EmployeeDB.getCount();
			for(int i=0;i<count;i++) {
				if(arr[i].getEmployeeId()==id) {
					
					arr[i].setExp(exp);
					return true;
				}
				
			}
		
			return false;
		}

		

		public Employee[] getEmployeeBySalary(int salary) {
			Employee arr1[] = getAllEmployees();
			int j=0;
			Employee[] sal=new Employee[EmployeeDB.count];
			//int count1=EmployeeDB.count; 
			
			for(int i=0;i<count;i++) {
				
				if(arr1[i].getSalary()==salary) {
					//System.out.println(arr1[i].getName() +"  "+ arr1[i].getExp()+"  "+arr1[i].getEmployeeId());
					sal[j]= arr1[i];
					
					j++;
					
					
				}
				
			}
			return sal ;
		}

		public Employee[] getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
			// TODO Auto-generated method stub
			Employee arr1[]=getAllEmployees();
			int j=0;
			int min=salaryRangeMin;
			int max=salaryRangeMax;
			int count1=EmployeeDB.count;
			Employee[] sal=new Employee[EmployeeDB.count];
			for(int i=0;i< count1;i++) {
				int temp=arr1[i].getSalary();
				if(temp>=min && temp<=max) {
					//System.out.println(arr1[i].getName() +"  "+ arr1[i].getExp()+"  "+arr1[i].getEmployeeId());
					sal[j]=arr1[i];
					j++;
			}
			
		}
			return sal;


}

		public Employee[] getEmployeeByExp(int exp) {
			Employee arr1[] = getAllEmployees();
			
			int count1=EmployeeDB.count; 
			int j=0;
			for(int i=0;i<count1;i++) {
				
				if(arr1[i].getExp()==exp) {
					//System.out.println(arr1[i].getName() +"  "+ arr1[i].getSalary()+"  "+arr1[i].getEmployeeId());
					
					sal[j]=arr1[i];
					j++;
				}			
			}
			return sal;
		}
		
		
		}
