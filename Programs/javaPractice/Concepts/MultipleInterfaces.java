package javaPractice.Concepts;

interface FirstInterface {

	// public, static and final variables
	final int a = 5;

	void myMethod();
}

interface SecondInterface {

	// public, static and final variables
	String s = "start";

	public void myOtherMethod();
}


//a class can implement multiple interfaces to support Multiple Inheritance in Java
public class MultipleInterfaces implements FirstInterface, SecondInterface {

	public void myMethod() {
		System.out.println("First Method");
	}

	public void myOtherMethod() {
		System.out.println("Second Method");
	}

	
	public static void main(String[] args) {

		MultipleInterfaces method = new MultipleInterfaces();
		method.myMethod();
		method.myOtherMethod();

		System.out.println(a);
		System.out.println(s);

	}

}
