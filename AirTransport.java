package Example2;

public class AirTransport {
	String airlineBrand = "", ManuFac="", model="";
	int capacity=0;
	String ManuFac2="", model2="";
	int capacity2 = 0;

	void printLanding1() { 
		System.out.println("This airplane needs around 5450ft of distance for landing.");
	}
	
	void printFly1() { 
		System.out.println("The maximum flying range of this airplane is 7400km.");
	}
	
	void printAccelerate1() { 
		System.out.println("This airplane is able to accelerate until 876km/h.");
	}
	
	void printDecelerate1() { 
		System.out.println("This airplane can decelerate until around 300km/h in the air.");
	}
	
	void printLanding2() { 
		System.out.println("This helicopter requires a sling length of at least 60 feet for landing.");
	}
	
	void printFly2() { 
		System.out.println("The maximum flying range of this helicopter is 740.8km.");
	}
	
	void printAccelerate2() { 
		System.out.println("This helicopter is able to accelerate until 302km/h.");
	}
	
	void printDecelerate2() { 
		System.out.println("This helicopter can decelerate until around 240km/h in the air.");
	}

}

