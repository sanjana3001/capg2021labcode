package lab3;
import java.time.*;
import java.util.*;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the year in yyyy format");
		int year=sc.nextInt();
		System.out.println("enter the month in MM");
		int month=sc.nextInt();
		System.out.println("enter the date in dd");
		int date=sc.nextInt();
		LocalDate temp=LocalDate.of(year, month, date);
		LocalDate today= LocalDate.now();
		Period Duration=Period.between(temp, today);
		System.out.println(" diff in year: "+ Duration.getYears()
		+" diff in month: "+Duration.getMonths()+ "  diff in days "+  Duration.getDays());
		
	}

}
