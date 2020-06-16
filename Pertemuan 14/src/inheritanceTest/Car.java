package inheritanceTest;

public class Car extends Vehicle {
	private int numDoors;
	private boolean isElectric;
	private String roofType;
	
	public Car (int numWheels, int numDoors, boolean isElectric, String roofType) {
		super(numWheels);
		this.numDoors = numDoors;
		this.isElectric = isElectric; 
		this.roofType = roofType;
	}
	
	public int getNumDoors() {
		return numDoors;
	}
	
	public boolean getIsElectric() {
		return isElectric;
	}
	
	public String getRoofType() {
		return roofType;
	}
}
