package lab5;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		ValidateName name=new ValidateName();
		boolean result=false;
		System.out.println("enter the first name");
		String fname=sc.nextLine();
		System.out.println(" enter the last name");
		String lname=sc.nextLine();
		try {
			result=name.validatename(fname,lname);
		} catch (NameValidationException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		if(result==true) {
			System.out.println(" age added successfully");
			System.out.println(" full name is : "+fname+" "+lname);
		}
		else if(result==false) {
			System.out.println(" unsuccessful attempt");
		}
		
		
		
	}

}
