package lab4;

public class EmailFilters {
	String emails[] = {
						
						"ramesh@gmail.com",
						"rakesh@outlook.com",
						"lokesh@linkedin.com",
						"mahesh@gmail.com",
						"ganesh@gmail.com",
						"rajesh@outlook.com"};
						
						

	public static void main(String[] args) {
		EmailFilters s=new EmailFilters();
		int gmail=0;
		int outlook=0;
		int linked=0;
		int len=s.emails.length;
		for(int i=0;i<len;i++) {
			if(s.emails[i].endsWith("gmail.com")) {
				 gmail++;
			}
			else if(s.emails[i].endsWith("outlook.com"))
			{
				outlook++;
				
			}
			else if(s.emails[i].endsWith("linkedin.com")) {
				linked++;
			}
		
	}
		System.out.println(" gmail:" + gmail );
		System.out.println(" outlook:" + outlook );
		System.out.println(" linkedin:" + linked );
		}}
	
						
						
