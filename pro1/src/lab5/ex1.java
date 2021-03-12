package lab5;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Validate v=new Validate();
		boolean result=false;
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		try {
			result=v.validate(age);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		if(result==true) {
			System.out.println(" age added successfully");
		}
		else if(result==false) {
			System.out.println(" unsuccessful attempt");
		}
		
		
	}

}
