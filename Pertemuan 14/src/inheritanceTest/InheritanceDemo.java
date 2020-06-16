package inheritanceTest;

public class InheritanceDemo {
	public static void main(String[]args) {
		Car Toyota = new Car(4, 5, false, "Close");
		System.out.println("Number of Doors on Toyota's Car : "+Toyota.getNumDoors());
		System.out.println("Number of Wheels on Toyota's Car : "+Toyota.getWheels());
		String electric;
		electric = Toyota.getIsElectric() ?"Yes " : "No";
		System.out.println("Is the Toyota's Car Electric ? "+electric);
		System.out.println("Roof Type on Toyota's Car : "+Toyota.getRoofType());
	}
}
