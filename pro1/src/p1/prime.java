package p1;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter n");
		int n=sc.nextInt();
		if(n<5)
		{
			System.out.println(" 2"+" 3");
			
		}
		else
		{   System.out.println("2"+"\n"+ "3" );
			for(int i=5;i<n;i++)
			{   
				if(i%2!=0 && i%3!=0)
				{   
					System.out.println(i);
				}
			}
		
		}
	}

}

