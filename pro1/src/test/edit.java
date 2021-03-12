package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class edit {

	public static void main(String[] args) {
		/*String str = "011-784-859-96"; 
        String[] arrOfStr = str.split("-", 3); 
  
        for (String a : arrOfStr) 
            System.out.println(a);*/
		
		List<String> list= new ArrayList<>();
		List<String> list1= new ArrayList<>();
		List<String> namesList = Arrays.asList( "dog", "idiot", "rascal");
        list.addAll(namesList); 
        System.out.println(list);
        
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the string");
        String line= sc.nextLine();
        String[] arr = line.split(" "); 
        String s="#";
        for(int i=0;i<arr.length;i++) {
        	if(list.contains(arr[i])) {
        		String repeat=s.repeat(arr[i].length());
        		//System.out.println(repeat);
        		arr[i]=repeat;
        		//System.out.println(arr[i]);
        		
        	}
        	list1.add(arr[i]);
        	
        }
        for(String a :list1)
        System.out.print(a+ " ");
        
	}

}
