package p1;

import java.util.Scanner;

public class trafficlig {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("choose any one among Red, Yellow or Green");
		char light=sc.next().charAt(0);
		if(light== 'R')
		{
			System.out.println("Stop");
		
		}
		else if(light=='Y')
		{
			System.out.println("ready");
		}
		else if(light=='G')
		{
			System.out.println("go");
		}
		
	}

}
