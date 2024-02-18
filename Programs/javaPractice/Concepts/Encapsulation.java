package javaPractice.Concepts;

public class Encapsulation {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(121);
		student.setName("Monty");
		
		System.out.println("ID: "+ student.getId());
		System.out.println("Name: "+ student.getName());

	}

}

class Student {
	
	//declare class variables/attributes as private
	private int id;
	private String name;
	
	//provide public getter and setter methods to access and update the attributes
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
}
