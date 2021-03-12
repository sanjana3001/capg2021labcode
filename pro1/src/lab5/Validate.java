package lab5;

public class Validate {
	
	public boolean validate(int age)throws ValidationException {
		if(age<15) {
			
			throw new ValidationException(" invalid age"+ age);
			
		}
		 
		return true;
		
		
	}

}
