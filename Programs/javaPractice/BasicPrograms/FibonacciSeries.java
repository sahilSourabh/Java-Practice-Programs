package javaPractice.BasicPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Fibonacci1();
		Fibonacci2();
		Fibonacci3();
		Fibonacci4();

	}
	
	//Display Fibonacci series with commas
	public static void Fibonacci1() {
		
		int a=0,b=1,c;
		int n=5;
		System.out.println("Fibonacci Series till "+n+" terms:");
		System.out.print(a+","+b);
		
		for(int i=2;i<n;++i)
		{
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
		}
		System.out.println();
	}
	
	public static void Fibonacci2() {
		
		int a=0,b=1,c;
		int n=8;
		System.out.println("Fibonacci Series till "+n+" terms:");
		
		for(int i=1;i<=n;++i)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
	}
	
	public static void Fibonacci3() {
		
		int a=0,b=1,c;
		int n=10, i=1;
		System.out.println("Fibonacci Series till "+n+" terms:");
		
		while( i++<=n )
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
			//i++;
		}
		System.out.println();
	}
	
	//Display Fibonacci series up to a given number
	public static void Fibonacci4() {
		
		int a=0,b=1,c;
		int n=100;
		System.out.println("Fibonacci Series upto "+n+":");
		
		while( a<=n )
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
	}
	

}
