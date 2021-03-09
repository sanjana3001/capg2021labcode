package p1;
import java.util.Scanner;

public class class1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter number");
		int num=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			 int a=num%10;
			 
			 num=num/10;
			
			 sum=sum+(a*a*a);
			 
		}
		System.out.println(sum);
		
		
		
	}

}
  