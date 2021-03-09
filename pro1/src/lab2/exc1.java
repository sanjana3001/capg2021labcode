package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class exc1 {
    static int getSecondSmallest() {
    	int n;  
    	Scanner sc=new Scanner(System.in);  
    	System.out.print("Enter the number of elements in the array: ");    
    	n=sc.nextInt();  
    	
    	int[] array = new int[n];  
    	System.out.println("Enter the elements of the array: ");  
    	for(int i=0; i<n; i++)  
    	{  
    	
    	array[i]=sc.nextInt();  
    	} 
    	Arrays.sort(array);
    	return array[1];
    	
    	
    	
    }
	public static void main(String[] args) {
		
     System.out.println(getSecondSmallest());
	}

}
