package lab2;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Arrays;
public class reverse {
    static int getSorted() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the no of elements");
    	int n=sc.nextInt();
    	int [] arr= new int[n];
    	
    	int temp;
    	for(int i=0;i<n;i++) {
    		temp=(sc.nextInt());
    		int reverse=0;
    		while(temp>0) {
    			int digit=temp%10;
    			reverse=reverse*10+digit;
    			temp=temp/10;
    		}
    		arr[i]=reverse;
    	}
    	for(int i=0;i<n;i++) {
    		System.out.print(arr[i]+" ");
    	}
    	
    	//return Arrays.sort(arr);
    	return 1;
    	
    }
	public static void main(String[] args) {
		getSorted();
	}
}
