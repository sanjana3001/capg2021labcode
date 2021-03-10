package com.capg.empapp.service;


	import com.capg.empapp.dao.EmployeeDAOImpl;
	import com.capg.empapp.dao.IEmployeeDAO;
	import com.capg.empapp.db.EmployeeDB;
	import com.capg.empapp.dto.Employee;
	import com.capg.empapp.execptions.InvalidEmployeeIdExcption;
	import com.capg.empapp.execptions.WrongSalaryException;

	public class EmployeeServiceImpl implements IEmployeeService {
	   // Animal a = new Dog();
		IEmployeeDAO dao;
        
		public EmployeeServiceImpl() {
			dao = new EmployeeDAOImpl();
		}

		public boolean addEmployee(Employee e) throws WrongSalaryException {
			
				//System.out.println(" ------------>> inside service "+e);
			
				if(e.getSalary()> 50000)
				{
					throw new WrongSalaryException();
				}
				else return dao.addEmployee(e);		
			
		}

		public Employee[] getAllEmployees() {

			return dao.getAllEmployees();
		}
		
		
		// ================================================================================

		public boolean editSalaryByEmployeeId(int salary, int id) throws InvalidEmployeeIdExcption {
			    if(!dao.editSalaryByEmployeeId(salary,id)) {
			    	throw new InvalidEmployeeIdExcption(" invalid id"+id);
			    	
			    }
			
			return dao.editSalaryByEmployeeId(salary,id);
		}

		public boolean editExpByEmployeeId(int exp, int id) throws InvalidEmployeeIdExcption {
			if(!dao.editExpByEmployeeId(exp,id)) {
		    	throw new InvalidEmployeeIdExcption(" invalid id"+id);
		    	
		    }
			return dao.editExpByEmployeeId(exp,id);
		}

		public Employee[] getEmployeeBySalary(int salary) {
			
			Employee arr[]= dao.getEmployeeBySalary(salary);
             return arr;
		
		}

		public Employee[] getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
			Employee arr[]= dao.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
            return arr;
			
         }

		public Employee[] getEmployeesByExp(int exp) {
			    Employee arr[]= dao.getEmployeeByExp(exp);
			    return arr;
		}
		
		}
