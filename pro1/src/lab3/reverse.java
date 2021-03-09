package lab3;

import java.util.Scanner;

public class reverse {
	
	public static String Reverse(String x) {
		StringBuffer sb= new StringBuffer(x);
		sb.reverse();
		x=sb.toString();
		return x;
		
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the string");
		String input= sc.nextLine();
	    String result= Reverse(input);
	    System.out.println(input+"|"+ result);
		
	}

}
