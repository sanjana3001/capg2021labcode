package p1;
import java.util.Scanner;
public class increasingnumber {
	
	static boolean checkNumber(int x) {
		boolean flag=true;
		int remainder=x%10;
		x=x/10;
		while(x>0) {
			if(remainder<x%10) {
				flag=false;
				break;
				
			}
			remainder=x%10;
			x=x/10;
		}
		if(flag==true)
		{
			return true;
		}
		else {
			return false;
			
		}
	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
        System.out.println(" the result of the increasing number is " + checkNumber(sc.nextInt()));
	}

}
