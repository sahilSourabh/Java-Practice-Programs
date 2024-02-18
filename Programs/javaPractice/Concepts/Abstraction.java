package javaPractice.Concepts;

public class Abstraction {

	public static void main(String[] args) {
		
		Bank b=new SBI();
		//SBI b = new SBI();
		
		System.out.println("Rate of Interest of SBI is: "+b.getRateOfInterest()+" %");  
		
		Bank p=new PNB();  
		System.out.println("Rate of Interest PNB is: "+p.getRateOfInterest()+" %");    

	}

}

abstract class Bank {
	
	abstract int getRateOfInterest();
	}

class SBI extends Bank {
	
	int getRateOfInterest() {
		return 7;
		}
	}

class PNB extends Bank {
	
	int getRateOfInterest() {
		return 8;
		}
	}
