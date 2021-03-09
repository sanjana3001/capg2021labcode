package lab3;

import java.util.Scanner;
import java.util.Arrays;
public class ex6 {

	public static boolean positive(String s) {
		char temp[]=s.toCharArray();
		Arrays.sort(temp);
		String result= new String(temp);
		if(s.equals(result)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String input=sc.nextLine();
		System.out.println("answer "+ positive(input));

	}

}
