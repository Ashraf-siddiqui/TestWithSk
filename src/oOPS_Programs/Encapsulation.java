package oOPS_Programs;

public class Encapsulation {

	
	
	private int rollNumber;
	private String Name;
	private String Address;
	private int MobileNumber;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		if(rollNumber>100)
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		MobileNumber = mobileNumber;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
