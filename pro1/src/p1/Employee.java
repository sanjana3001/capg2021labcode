package p1;
import java.util.Scanner;
public class Employee {
	 
		
	
		private String name;
	    private int age;
	    private String gender;
	    private String company;
	    
	   
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		

	

	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		e.setName("sanjana");
		System.out.println(e.getName());
		
	}
	}

