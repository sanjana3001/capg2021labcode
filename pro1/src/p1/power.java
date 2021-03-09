package p1;
import java.util.Scanner;
public class power {
	static boolean checkNumber(int n) {
		    
		    if (n == 0)
				return false;
			
			while (n != 1)
			{
				if (n % 2 != 0)
					return false;
				n = n / 2;
			}
			return true;
	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		System.out.println(" the result of the power of 2 is " + checkNumber(sc.nextInt()));
	

	}

}
