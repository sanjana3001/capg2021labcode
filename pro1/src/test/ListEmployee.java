package test;

import java.util.ArrayList;



public class ListEmployee {
	private int id;
	private int salary;
	private String name;
	
	
	public ListEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<ListEmployee> emp= new ArrayList<ListEmployee>();
	public ListEmployee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		
	}

 static {
	ListEmployee e1=new ListEmployee(101,30000, "abc");
	ListEmployee e2=new ListEmployee(102,50000, "def");
	
	emp.add(e1);
	emp.add(e2);
	  System.out.println(emp);
 }
 public ArrayList<ListEmployee> getEmp(){
	 System.out.println(ListEmployee.emp);
	 return ListEmployee.emp;
 }
 
 public static void main(String[] args) {
	ListEmployee t=new ListEmployee();
		
	System.out.println(t.getEmp());
	
}
}
