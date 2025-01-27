package javaPractice.BasicPrograms;

import java.util.Scanner;

public class FullPrime {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n=in.nextInt();
		
		//System.out.println(digitPrime(n));
		
		if (prime(n)) {

			System.out.println(n + " is a Prime number");
		} else {
			System.out.println(n + " is NOT a Prime number");
		}

		if (prime(n) && digitPrime(n)) {
			
			System.out.println(n + " is a Full Prime number");
		} 
		else 
		{
			System.out.println(n + " is NOT a Full Prime number");
		}
		
		in.close();

	}

	public static boolean prime(int n) {

		if (n == 0 || n == 1) {
			return false;
		}
		
		for (int i=2; i < n/2; i++) {
			
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean digitPrime(int n) {

		while (n > 0) {
			
			int digit = n%10;
			n = n/10;

			if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
				return false;
			}

		}
		return true;
	}

}
