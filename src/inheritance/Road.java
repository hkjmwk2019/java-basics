package inheritance;

class Vehicle{
	String color;
	String wheels;
	String model;
	Vehicle(){
		String color = "Vehicle initialize : no color ";
		String wheels = "Vehicle initialize: No wheels ";
		String model = "Vehicle initialize: No model ";
		System.out.print("Vehicle class constructor ");
	}	
	
	public void run(){
		System.out.println("Vehicle run ...");
	}
}

class Truck extends Vehicle{
	String color = "Truck initialize : ";
	String wheels = "Truck initialize:  ";
	String model = "Truck initialize:  ";
	System.out.println("Vehicle class constructor ");
	
	
	public void run() {
		System.out.println("Truck run ...");
	}
		
}

class Bus extends Vehicle{
	String color = "Bus initialize : ";
	String wheels = "Bus initialize:  ";
	String model = "Bus initialize:  ";
	
	public void run() {
		System.out.println("Bus run ...");
	}
}

class Car extends Vehicle{
	String color = "Car initialize : ";
	String wheels = "Car initialize:  ";
	String model = "Car initialize:  ";
	public void run() {
		System.out.println("Car run ...");
	}
}

public class Road {

	public static void main(String[] args) {
		Truck  t= new Truck();
		t.run();
		
		Bus b= new Bus();
		b.run();
		
		Car c= new Car();
		c.run();

	}

}
