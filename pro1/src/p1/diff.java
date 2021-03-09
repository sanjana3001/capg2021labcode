package p1;
import java.util.Scanner;
public class diff {
    static int calculatedifference(int x) {
    	int sq_sum=0;
    	for(int i=0;i<=x;i++)
    	{
    		sq_sum=sq_sum+(i*i);
    	}
    	System.out.println(sq_sum);
    	
    	int sum_sq=0;
    	int sum=0;
    	for(int j=0;j<=x;j++)
    	{
    		sum=sum+j;
    	}
    	sum_sq=sum*sum;
    	System.out.println(sum_sq);
    	
    	return (sq_sum-sum_sq);
    	
    	
    }
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int result= calculatedifference(sc.nextInt());
		System.out.println(" difference=" + result);
		
	}

}
