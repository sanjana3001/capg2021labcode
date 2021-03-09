package test;

import java.util.Scanner;
import java.util.Arrays;

public  class Employee {
	 private String name;
	 private int salary;
	 private int exp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
    public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int count=0;
		 Employee arr[]= new Employee[50];
		 System.out.println(" choose the operation");
		 System.out.println("1.add employee");
		 System.out.println("2.edit");
		 System.out.println("3.display all employee");
		 System.out.println("4.display emp based on salary");
		 System.out.println("5.display based on salary range");
		 System.out.println("6.display emp based on exp range");
		 System.out.println("7.display emp based on exp");
		 System.out.println("\n"+"\n");
		 Operations o=new Operations();
		 int option;
		 
		 do {
			 System.out.println(" enter the option");
			 option=sc.nextInt();
			 
			 switch(option) {
			 
			 case 1: 
				 System.out.println("enter the no of employee you want to add");
				 int  n=sc.nextInt();
				 count=n;
				 for(int i=0;i<n;i++) {
					    arr[i]=new Employee();
					    System.out.println(" enter the name of the person");
				    	arr[i].setName(sc.next());
				    	System.out.println("enter the exp");
				    	int res=sc.nextInt();
				    	arr[i].setExp(res);
				    	System.out.println("enter the salary");
				    	int salary=sc.nextInt();
				    	int check=res;
				  
				    	
					    boolean status=false;
					    try{
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
						
					            }
					      catch (Exception e) {
								System.out.println( "wrongsalary"+ e);
							
					            }
					       if(status) {
						          System.out.println("added succesfully");
					           }
					       else {
						           System.out.println("unsuccesful");
					            } 
				           }
				 
				 
				 break;
			 case 2:
				    System.out.println("enter the name of the employee");
			    	String str=sc.next();
			    	//System.out.println("enter the total no of emp");
			    	//count= sc.nextInt();
			    	System.out.println(" enter if you want to edit  salary s or exp e");
			    	char input=sc.next().charAt(0);
			    	
			    	
			    	if(input=='s') {
			    		System.out.println("changing salary");
			    	for(int j=0;j<count;j++) {
			    		
			    		String g=arr[j].getName();
			    		//System.out.println(g);
			    		if(g.equals(str)) {			    			
			    			   System.out.println(" enter the new salary");
			    				arr[j].setSalary(sc.nextInt());
			    			}}}
			    	else if((input=='e')) {
			    		System.out.println("changing exp ");
			    		
			    		for(int j=0;j<count;j++) {
			    			String r=arr[j].getName();
			    			if(r.equals(str)) {
			    				  System.out.println("enter the new exp");
					    		  arr[j].setExp(sc.nextInt());
			    			}
			    		   
			    			}	
			    		
			    	}
			    	break;
			  
			 case 3:
				// System.out.println(" enter teh no of employees");
				 //int y=sc.nextInt();
				 System.out.println(" displaying all emp details");
				 System.out.println("name "+"\t"+ "salary"+"\t"+ "exp");
				 for(int k=0;k<count;k++) {
					 System.out.println(arr[k].getName() +"\t"+ arr[k].getSalary()+"\t"+ arr[k].getExp()); 
				 }
				 break;
				 
			 case 4:
				// System.out.println("enter the no of emp");
				// int r=sc.nextInt();
				 System.out.println(" enter the salary you want to refer");
				 int sal=sc.nextInt();
				 for(int t=0;t<count;t++) {
					 int c=arr[t].getSalary();
					 if(c==sal) {
						 System.out.println(arr[t].getName()+ "  "+ arr[t].getExp()+"  "+ arr[t].getSalary());
					 }
				 }
				 break;
			 case 5:
				 System.out.println("enter the salary range");
				 System.out.println("enter the min sal");
				 int a=sc.nextInt();
				 System.out.println("enter the max salary");
				 int b=sc.nextInt();
				 for(int ran=0;ran<count;ran++) {
					 int t=arr[ran].getSalary();
					 if(t>=a && t<=b) {
						 System.out.println(arr[ran].getName()+ " "+ arr[ran].getSalary());
					 }
				 }
				 break;
			 case 6: 
				 System.out.println("enter the exp range");
				 System.out.println("enter the min exp");
				  a=sc.nextInt();
				 System.out.println("enter the max exp");
				  b=sc.nextInt();
				 for(int ran=0;ran<count;ran++) {
					 int t=arr[ran].getExp();
					 if(t>=a && t<=b) {
						 System.out.println(arr[ran].getName()+ " "+ " "+ arr[ran].getExp()+" "+ arr[ran].getSalary());
					 }
				 }
				 break;
				 
			 }
		 }while(option!=0);
		 
		 
		 
		 
	
	}

}
