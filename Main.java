package Example2;

public class Main {
	
	public static void main (String [] args) {
		
		AirTransport airplane = new AirTransport();
		airplane.airlineBrand = "American Airlines";
		airplane.ManuFac="Airbus";
		airplane.model="A321";
		airplane.capacity=185;
		System.out.println("Airline brand of the airplane: " + airplane.airlineBrand);
		System.out.println("Manufactured company: " + airplane.ManuFac);
		System.out.println("Model: " + airplane.model);
		System.out.println("Capacity: " + airplane.capacity + " passengers");
		airplane.printLanding1();
		airplane.printFly1(); 	
		airplane.printAccelerate1();
		airplane.printDecelerate1();
		System.out.println();	
		
		AirTransport helicopter = new AirTransport();
		helicopter.ManuFac="Boeing";
		helicopter.model="CH-47 Chinook";
		helicopter.capacity = 55;
		System.out.println("Manufactured company of the helicopter: " + helicopter.ManuFac);
		System.out.println("Model: " + helicopter.model);
		System.out.println("Capacity: " + helicopter.capacity + " troops");
		helicopter.printLanding2();
		helicopter.printFly2(); 	
		helicopter.printAccelerate2();
		helicopter.printDecelerate2();
			
	}
}
