package lab5;

public class ValidateName {
	
	public boolean validatename(String fname, String lname)throws NameValidationException {
		if(fname.equals("")&& lname.equals("")) {
			
			throw new NameValidationException(" invalid name" + fname+lname);
			
		}
		 
		return true;
		
	}
}
