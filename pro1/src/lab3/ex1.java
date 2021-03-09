package lab3;

import java.util.Scanner;
import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		 
		 
		System.out.println("enter the string of intergers");
		String line=sc.nextLine();
	
		int len=line.length();
	    
		int num=Integer.parseInt(line);
		
		for(int i=0;i<len;i++) {
			System.out.println(line.charAt(i));
		}
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("sum="+ sum);
		
		

	}

}
