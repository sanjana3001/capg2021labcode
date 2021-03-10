package com.capg.empapp.main;


	import java.util.Iterator;
import java.util.Scanner;

	import com.capg.empapp.db.EmployeeDB;
	import com.capg.empapp.dto.Employee;
import com.capg.empapp.execptions.InvalidEmployeeIdExcption;
import com.capg.empapp.service.EmployeeServiceImpl;
	import com.capg.empapp.service.IEmployeeService;

	public class EmpMainClass {
		
		IEmployeeService empService = new EmployeeServiceImpl();
		static int count = EmployeeDB.count; 
		
		public static void main(String[] args) {
			
			EmpMainClass app = new EmpMainClass();
			Scanner sc = new Scanner(System.in);
			while(true)
			{
				System.out.println(" === MUNU ==== ");
				System.out.println("1. add employee ");
				System.out.println("2. Display All Employee ");
				System.out.println("3. display based on salary");
				System.out.println("4. dispay based on sal range");
				System.out.println("5. display based on exp");
				System.out.println("6. edit salary");
				System.out.println("7. edit exp");
				System.out.println("0. EXIT");
				System.out.println("Enter Option");
				int option = sc.nextInt();
				switch(option)
				{
				
				case 1:
					
					System.out.println("Enter Employee Id ");
					int empId = sc.nextInt();
					
					System.out.println("Enter Employee Salary ");
					int empSalary = sc.nextInt();
					
					System.out.println("Enter Employee Exp ");
					int empExp = sc.nextInt();
					
					System.out.println("Enter Employee Name ");
					String name = sc.nextLine();
					
					Employee e = new Employee(empId, name, empExp, empSalary);
					
					try
					{
						boolean isInserted = app.empService.addEmployee(e);
						if(isInserted)
						{
							System.out.println(" Employee Added !!!");
						}
						else
						{
							 throw new Exception("Cannot added Employee ...");
						}
					}
					catch(Exception ex)
					{
						System.out.println(" Contact to Customer Care ... "+ex); // raise the exception
					}
					
					break;
				case 2:
					
					Employee arr[] = app.empService.getAllEmployees();
					int count = EmployeeDB.count;  // not the code
					System.out.println("  --->>  count in main "+count);
					for (int i = 0; i < count; i++) {
						System.out.println(arr[i]);
						System.out.println(" ========================================================");
					}
					break;
				case 3:
					
										
					System.out.println(" enter the emp salary");
					int sal=sc.nextInt();
					 //count= EmployeeDB.getCount();
					 Employee[] res=app.empService.getEmployeeBySalary(sal);
					 count=res.length;
					for(int i=0;i<count;i++) {
						if(res[i]!=null) {
					      System.out.println(res[i].getName() +"  "+ res[i].getExp()+"  "+res[i].getEmployeeId());
					}}
					break;
					
				case 4:
					System.out.println("enter the min and max salary");
					System.out.println("enter the min salary");
					int min=sc.nextInt();
					System.out.println(" enter the max range");
					int max=sc.nextInt();
					count = EmployeeDB.count;
					Employee[] res1=app.empService.getEmployessBySalaryRange(min, max);
					for(int i=0;i<count ;i++) {
						
					     System.out.println(res1[i].getName() +"  "+ res1[i].getExp()+"  "+res1[i].getEmployeeId());
					}
					
					break;
					
				case 5:
					System.out.println(" enter the exp ");
					int exp=sc.nextInt();
				    count = EmployeeDB.count;
					Employee[] res2=app.empService.getEmployeesByExp(exp);
					for(int i=0;i<count ;i++) {
						if(res2[i]!=null) {
					     System.out.println(res2[i].getName() +"  "+ res2[i].getExp()+"  "+res2[i].getEmployeeId());
					}}
					break;
					
					
				case 6:
					System.out.println(" enter the id of emp to edit salary");
					 int temp=sc.nextInt();
					 System.out.println("enter the new salary");
					  sal=sc.nextInt();
					
					try {
						app.empService.editSalaryByEmployeeId(sal,temp);
					} catch (InvalidEmployeeIdExcption e1) {
						
						System.out.println(e1.getMessage());
					}
					break;
				case 7:
					System.out.println(" enter the id of emp to edit exp");
					int id=sc.nextInt();
					System.out.println(" enter the new exp");
					exp=sc.nextInt();
					
					try {
						app.empService.editExpByEmployeeId( exp, id);
						
					} catch (InvalidEmployeeIdExcption e1) {
						
						System.out.println(e1.getMessage());
					}
					break;
				
				case 0:
					System.exit(0);
				
				
				
				}//end switch
				
			}// end while
			
			
			
		}//end main
}
