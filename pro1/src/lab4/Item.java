package lab4;

public abstract class Item {
	
	
	private int identification_number;
	 private String title;
	 private int copies;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdentification_number() {
		return identification_number;
	}
	
	public void setIdentification_number(int identification_number) {
		this.identification_number = identification_number;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getCopies() {
		return copies;
	}
	
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public void checkIn() {
		
	}
	public void checkout() {
		
	}
	public void addItem() {
		
	}
}


