package com.capg.empapp.execptions;

public class InvalidEmployeeIdExcption extends Exception {
    private int id;
	public InvalidEmployeeIdExcption() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InvalidEmployeeIdExcption(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidEmployeeIdExcption(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidEmployeeIdExcption(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidEmployeeIdExcption(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public int InvalidEmployeeIdExcption (int id) {
   	   this.id=id;
   	   return id;
    }
    
    public String toString()
	{
		return "invalid id "+id ;
	}

	
}
