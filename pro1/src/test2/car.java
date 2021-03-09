package test2;

public class car {
	private String name;
	private String colour;
	private String tyretype;
	private String engine;
	private swheel wheel;
	
	public swheel getWheel() {
		return wheel;
	}

	public void setWheel(swheel wheel) {
		this.wheel = wheel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getTyretype() {
		return tyretype;
	}

	public void setTyretype(String tyretype) {
		this.tyretype = tyretype;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}





	public static void main(String[] args) {
		swheel wheel = new swheel("forward","on");
		car c=new car();
		
		c.setName("bmw");
		c.setColour("black");
		c.setEngine("on");
		
		System.out.println("name "+ c.getName());
		System.out.println("colour " + c.getColour());
		System.out.println(" engine "+ c.getEngine());
		System.out.println("wheel direction " + wheel.getDirection());
		
		
		
		
				

	}

}
