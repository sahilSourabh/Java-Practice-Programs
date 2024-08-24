package javaPractice.Concepts;

public class Super {

	public static void main(String[] args) {
		
		Employee emp = new Employee(121, "Monty", 65000);
		emp.printInfo();
		//emp.details();
	}

}

//super keyword in Java is a reference variable which is used to refer immediate parent class object.
//super can be used to refer to immediate parent class instance variables, methods and constructor.
class Person {
	
	int id;
	String name;
	String term= "Contractual/Permanent";
	
	Person(int id, String name) {
		
		this.id=id;					//this keyword is used to refer to current instance of the variable
		this.name=name;
	}
	
	void details() { 
		System.out.println("(calling parent method through super) "+" Details ");
	}
}

class Employee extends Person {

	String term="Permanent";
	float salary;
	
	Employee (int id, String name, float salary) {
		
		super(id,name);
		this.salary = salary;	
	}
	
	void details() {
		System.out.println("(child method) "+" Employee Details");
	}
	
	void printInfo() {
		
		super.details();
		details();
		System.out.println("(parent class instance variable) "+super.term);
		System.out.println("(child class variable) "+term);
		System.out.println(id+" "+name+" "+salary);
	}
	
}
