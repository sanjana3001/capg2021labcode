package test;
import java.util.ArrayList;
public class list {
 public static void main(String[] args) {
		   
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		        list1.add(10);
		        list1.add(3);
		        list1.add(50);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		        list2.add(2);
		        list2.add(48);
		        list2.add(65);
		
		        list1.addAll(list2);
		       
		System.out.println("L1 : "+list1);
		System.out.println("L2 : "+list2);
		System.out.println("Merged list: "+list1);
		if(list1.contains(48)) {
			System.out.println(" element present at index : " + list1.indexOf(48));
		}
		else {
			System.out.println(" not present");
		}
		}
		


	}


