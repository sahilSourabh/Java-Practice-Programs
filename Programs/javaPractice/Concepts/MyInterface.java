package javaPractice.Concepts;

public class MyInterface {

	public static void main(String[] args) {
		
		Pig pig = new Pig();
		pig.animalSound();
		pig.sleep();
		
		Lion lion = new Lion();
		lion.sleep();
		lion.animalSound();
		
	}

}
//Interface can be implemented by multiple classes
interface Animal {
	
	
	// public and abstract
	void sleep();
	void animalSound();
}

 class Pig implements Animal {

	public void sleep() {
		System.out.println("ZZzz");
		
	}

	public void animalSound() {
		
		System.out.println("The pig says: wee wee");
		
	}
}
 
 class Lion implements Animal {

		public void sleep() {
			System.out.println("ZZzz");
			
		}

		public void animalSound() {
			
			System.out.println("The lion says: Roarrrr !!");
			
		}
 }

