package test;

import java.util.HashSet;
import java.util.Set;

public class Setdemo {
	
	public static void main(String[] args) {
		Student s=new Student("student1", 13, "abc");
		Student s1=new Student("student1", 13, "abc");
		
		
		
		
		Set<Student> match= new HashSet<>();
		match.add(s);
		match.add(s1);
	    System.out.println(" s:   "+s);
	    System.out.println(" s1:  "+s1);
		System.out.println("s=s1:  "+s.equals(s1));
		System.out.println("match contains s1?:   "+match.contains(s1));
		System.out.println(match.contains(new Student("student3", 13, "abc")));
		System.out.println("match size:   "+match.size());
		
		
		
	}

}
