package javaPractice.Concepts;

//Polymorphism Example
public class MethodOverriding {

	public static void main(String[] args) {

		Vehicles obj = new Vehicles();
		obj.run();

		Bikes obj1 = new Bikes();
		obj1.run();

		Cars obj2 = new Cars();
		obj2.run();
	}
}

//parent class
class Vehicles {
	public void run() {
		System.out.println("The Vehicles are Running !");
	}

}

class Bikes extends Vehicles {

	// defining the same method as in the parent class
	public void run() {
		System.out.println("Overriden method: " + "The bikes are Running !"); // Overrides the run method of Vehicle class 
	}
}

class Cars extends Vehicles {

	// defining the same method as in the parent class
	public void run() {
		System.out.println("Overriden method: " + "The cars are Running !"); // Overrides the run method of Vehicle class
	}
}
