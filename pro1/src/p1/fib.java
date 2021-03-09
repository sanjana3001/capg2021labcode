package p1;
import java.util.Scanner;
public class fib {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int n1=1;
		int n2=1;
		int n3=0;
		if(n==1)
		{
			System.out.println(n1);
		}
		if(n==2)
		{
			System.out.println(n2);
		}
		if(n>2)
		{
			for(int i=2;i<n;i++)
		
		   {   
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
				
		    }
		System.out.println(n3);
		
		}
		
	}

}
