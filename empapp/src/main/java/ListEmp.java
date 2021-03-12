
import java.util.ArrayList;


	
public class ListEmp {
	 private String name;
	 private int salary;
	 private int id;
	// ListEmp e=new ListEmp();
	 
public ListEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

public ListEmp(String name, int salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	} 
 public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String toString() {
	
	return " Employee name: "+name+"  salary:" +salary;
}

public static void main(String[] args) {
	 ListEmp e=new ListEmp();
    ArrayList<ListEmp> employees  = new ArrayList<ListEmp>();
		

   
	
	employees.add(new ListEmp("Krishna",1,100000));
	employees.add(new ListEmp("Ram",2,100000));
	
	for (ListEmp employee : employees) {
	      System.out.println(employee);	}

    employees.clear();
    
    for (ListEmp employee : employees) {
	      System.out.println(employee);	
}
    
}
}


