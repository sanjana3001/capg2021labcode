package test;

import lab4.EmployeeService;

public class Sub {

	private String employees[] =
		{"101001011","102001022","103002011","104003080","105002020","106002080"};
	
	public String[] getEmployeeCodes()
	{
	String codes[] = new String[employees.length];
	int count = -1;
	for (String deptid : employees) {
	codes[++count] = deptid.substring(3, 6);
	
	}
	return codes;
	}
}
	
	