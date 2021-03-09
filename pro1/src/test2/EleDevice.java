package test2;

public abstract class EleDevice {
	private String devicename;
	private int modelnumber;
	private String colour;
	private Power power;
	
	

	public EleDevice(String devicename, int modelnumber, String colour, Power power) {
		super();
		this.devicename = devicename;
		this.modelnumber = modelnumber;
		this.colour = colour;
		this.power = power;
	}

	public String getDevicename() {
		return devicename;
	}
	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}
	public int getModelnumber() {
		return modelnumber;
	}
	public void setModelnumber(int modelnumber) {
		this.modelnumber = modelnumber;
	}
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	public Power getPower() {
		return power;
	}
	public void setPower(Power power) {
		this.power = power;
	}
	
	
	public abstract void deviceon();
	public abstract void deviceoff();

	

}

    
