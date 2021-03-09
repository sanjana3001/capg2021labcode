package lab4;
import java.util.Scanner;
import java.util.Random;
public class Account {
	private long accountnumber;
	private double balance;
	Person accHolder;
	Random rand = new Random(); 
	 
	public long accnum() {
		
		
		//System.out.println(" account number:" + rand.nextLong());
		return  rand.nextLong();
		
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
    public void deposit(double amount) {
    	balance=balance+amount;
    	System.out.println(" Deposited: " + amount );
    	System.out.println(" new balance:" + balance);
    }
    public void withdraw(double amount) {
    	if(balance-amount>500) {
    	balance=balance-amount;
    	System.out.println(" Withdrawn: " + amount );
    	System.out.println(" new balance:" + balance);
    	}
    	else {
    		System.out.println("Cannot withdraw, min balance 500 required ");
    	}
    }
    public class SavingsAccount extends Account{
    	final double minbalance=500;
    	public void withdraw(double amount) {
    		if(balance-amount>500) {
    	    	balance=balance-amount;
    	    	System.out.println(" Withdrawn: " + amount );
    	    	System.out.println(" new balance:" + balance);
    	    	}
    	    	else {
    	    		System.out.println("Cannot withdraw, min balance 500 required ");
    	    	}
    	}
    	
   public class CurrentAccount extends Account{
    		double overdraft=100000;
    
    		public void withdraw(double amount) {
        		if(amount>100000) {
        	    	System.out.println("false");
        	    	
        		}
        	    	else {
        	    	  System.out.println(" true");
        	    	}
    	}
    	
    }}
    
    
	public static void main(String[] args) {
		
		 
		 
     int option;
    
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter one choice from below");
     System.out.println("1.Create Account");
     System.out.println("2.deposit");
     System.out.println("3.withdraw");
     System.out.println("4. show balance");
     System.out.println(" 0.exit");
     Person person=new Person();
     Account a[] =new Account[10];
     Person user[]= new Person[10];
     do {
    	 System.out.println(" enter an option ");
    	 option =sc.nextInt();
    	 
    	 
    	 switch(option) {
    	 
    	 
    	 case 1:
    	     System.out.println("enter the no of users");
    	     int n=sc.nextInt();
    	    // Person user[]=new Person[n];
    	    
    	     for(int i=0;i<n;i++) {
    	    	   System.out.println(" enter the name of the user");
    	    	   user[i]=new Person();
    	    		user[i].setName(sc.next());
		    		 System.out.println("enter the age");
		    		 user[i].setAge(sc.nextFloat());
		    		  a[i]= new Account();
		    		 a[i].setAccHolder(user[i]);
		    		 System.out.println("accoutn created ");
		    		 System.out.println(" your user number is: "+ i);
		    		 System.out.println("account number=" + a[i].accnum());
		    		 System.out.println("enter the initial balance");
		    		 a[i].setBalance(sc.nextDouble());
    	     }
    	     break;
    	    	 
    	     
    	    
    		
    	 case 2:
    		 System.out.println("enter the user number of the person");
    		 int p=sc.nextInt();
    		 System.out.println(" enter the amount to be deposited");
    		 a[p].getBalance();
    		 a[p].deposit(sc.nextDouble());
    		 break;
    	 case 3:
    		 System.out.println("enter the user number of the person");
    		 int t=sc.nextInt();
    		 System.out.println("enter the amount ");
    		 a[t].getBalance();
    		 a[t].withdraw(sc.nextDouble());
    		 break;
    	 case 4:
    		 System.out.println(" enter the user number of person to check balance");
    		 int bal=sc.nextInt();
    		 //System.out.println(" name: "+);
    		 System.out.println(user[bal].getName()+ " " + a[bal].getBalance());
    		// a.getAccHolder().getBalance();
    		 break;
    	

    	 }
     }while(option!=0);
     
	}
}

