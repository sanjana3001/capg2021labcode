package lab2;
import java.util.*;
import java.util.Scanner;
public class exc2 {
	 static int sortStrings() {
	    	int n;  
	    	
	    	Scanner sc=new Scanner(System.in);  
	    	System.out.print("Enter the number of elements in the array: ");    
	    	n=sc.nextInt();  
	    	String[] array = new String[n];   
	    	System.out.println("Enter the elements of the array: ");  
	    	for(int i=0; i<n; i++)  
	    	{  
	    	
	    	array[i]=sc.next();  
	    	} 
	    	
	    	Arrays.sort(array);
	    	
	    	String[] result= new String[n];
	    	for(int i=0;i<n;i++)
	    	{
	    	  
	    		result[i]=array[i].toUpperCase();
	    	    result[n-1-i]=array[n-1-i].toLowerCase();
	    	  }
	    	
	    	if(n%2!=0) {
	    		
	    		
	    		result[n/2+1]=result[n/2+1].toUpperCase();
	    	}
	    	
	    	for(int i=0;i<n;i++) {
	    			System.out.println(result[i]);
	    			
	    		}
	    	
	    	
	    	
	    	return 1;
	    }

	public static void main(String[] args) {
		sortStrings();
	}

}
