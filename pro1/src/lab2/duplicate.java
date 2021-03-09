package lab2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class duplicate {

	static int modifyArray() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n= sc.nextInt();
		int[] array= new int[n];
		int[] array1= new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
       
		int[] temp = new int[n];
		int j = 0;
		for(int i=0; i<n-1; i++){
		if(array[i] != array[i+1]){
		temp[j++] = array[i];
		}
		}
		temp[j++] = array[n-1];
		//Changing the original array
		for(int i=0; i<j; i++){
		array[i] = temp[i];
		}
		
		for(int i=j-1;i>-1;i--) {
		
			System.out.print(array[i]+ " ");
		}
		   
     return 1;
	}
	public static void main(String[] args) {
		
		modifyArray();
		
	}

}
