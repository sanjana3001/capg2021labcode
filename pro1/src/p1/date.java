package p1;
import java.util.Scanner;
public class date {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date");
		int date= sc.nextInt();
		if(date>32 || date<1)
		{
			System.out.println("Wrong date");
			
		}
		else if( date==2 || date==22)
		{
			System.out.println(date+"nd");
			
		}
		else if(date== 1 || date==21 || date==31)
		{
			System.out.println(date+"st");
			
		}
		else if(date== 3 || date==23)
		{
			System.out.println(date+"rd");
			
		}
		else 
		{
			System.out.println(date+"th");
		}
	}
}
