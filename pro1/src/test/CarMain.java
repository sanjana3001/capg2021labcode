package test;

import java.util.HashSet;
import java.util.Set;

public class CarMain {

	public static void main(String[] args) {
		car c=new car();
		
		car c1=new car("bmw","black");
		car c2=new car("bmw","black");
		//car c2=new car(" swift"," red")
		
		Set<car> cars= new HashSet<>();
		cars.add(c1);
		cars.add(c2);
		
		System.out.println("c1:  "+c1);
		System.out.println("c2:  "+c2);
		//System.out.println("cars:  "+cars);
		System.out.println("c1 = c2?:   "+c1.equals(c2));
		
		System.out.println(" cars size: " +cars.size());
		System.out.println("cars contains c2? :  " +cars.contains(c2));
		System.out.println(cars.contains(new car(" bmw"," black")));
		

	}

}
