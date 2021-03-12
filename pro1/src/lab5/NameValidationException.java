package lab5;

public class NameValidationException extends Exception {
	String fname;
	String lname;
	public NameValidationException(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public NameValidationException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NameValidationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public NameValidationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public NameValidationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public NameValidationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
