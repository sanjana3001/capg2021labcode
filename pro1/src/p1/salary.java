package p1;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter monthly basic salary");
		int basic_salary=sc.nextInt();
		int HRA=(15*basic_salary)/100;
		int DA=(60*basic_salary)/100;
		int monthly_net_salary=basic_salary+HRA+DA;
		int net_annual_salary_aftertax;
		int net_annual_salary=12*monthly_net_salary;
		System.out.println("Basic Salary: "+ basic_salary);
		System.out.println("HRA :" + HRA);
		System.out.println("DA    :"+DA);
		System.out.println("Monthly Net Salary:" +monthly_net_salary);
		System.out.println("Annual Salary :"+ net_annual_salary);
		
		int tax=0;
		int net_salary_after_tax=0;
		if(net_annual_salary<300000)
		{
			
			  tax =0; 
			 net_salary_after_tax =net_annual_salary;
		}
		else if(net_annual_salary>300001 && net_annual_salary<700000)
		{
			tax =10;
			net_salary_after_tax = ((10*net_annual_salary)/100+net_annual_salary);
		}
		else if(net_annual_salary>700001 && net_annual_salary<1500000)
		{
			tax =15;
			net_salary_after_tax =((15*net_annual_salary)/100+net_annual_salary);
			
		}
		else if(net_annual_salary>1500000)
		{ tax=30;
		  net_salary_after_tax =((30*net_annual_salary)/100+net_annual_salary);
			
		}
		System.out.println(" tax "+tax+"% :" + (tax*net_annual_salary)/100);
		 System.out.println("net salary after tax :" +(net_annual_salary-(tax*net_annual_salary)/100));
			
	}

}
