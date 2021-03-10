package lab4;

public class EmployeeService {

	private String employees[] =
		{"101001011","102001022","103002011","104003080","105002020","106002080"};
	
	public String[] getEmployeeCodes()
	{
	String codes[] = new String[employees.length];
	int count = -1;
	for (String empid : employees) {
	codes[++count] = empid.substring(3, 6);
	
	}
	return codes;
	}
	

//public class MainExecution {
     public static void main(String[] args) {
          EmployeeService service = new EmployeeService();
          String codes[] = service.getEmployeeCodes();
          
          String emploc;
          

			
			for (String empid : codes) {
				 switch(empid){
		              case "101":
		            	  System.out.println(empid+ "  Delhi");
		            	  break;
		              case "102":
		            	  System.out.println(empid+ "  Mumbai");
		            	  break;
		              case "103":
		            	  System.out.println(empid+ "  Delhi");
		            	  break;
		              case "104":
		            	  System.out.println(empid+ "  Bangalore");
		            	  break;
		              case "105":
		            	  System.out.println(empid+ "  Pune");
		            	  break;
		              case "106":
		            	  System.out.println(empid+ "  Bangalore");
		            	  break; 
				 }
		            	  
				
				 }

}//end main
}//end class
