package p1;
import java.util.Scanner;
public class checknsum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int result=calculatesum(num);
		System.out.println("sum of natural numbers divisible by 3 or 5 =" + result);
		
	}
	
	static int calculatesum(int x) {
		int sum=0;
		for(int i=1;i<x;i++)
		{
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
		
	}

}


