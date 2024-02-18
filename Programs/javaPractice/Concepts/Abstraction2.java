package javaPractice.Concepts;

public class Abstraction2 {

	public static void main(String[] args) {
		
		Honda obj = new Honda();
		obj.run();
		obj.changeGear();

	}

}

//Example of an abstract class that has abstract, non-abstract methods and Constructor 
abstract class Car {

	Car() {    										//Constructor
		System.out.println("bike is created");        
	}

	abstract void run();							//abstract method

	void changeGear() {								//non-abstract method
		System.out.println("gear changed");
	}
}

//Creating a Child class which inherits Abstract class  
class Honda extends Car {
	
	void run() {
		System.out.println("running safely..");
	}
}
