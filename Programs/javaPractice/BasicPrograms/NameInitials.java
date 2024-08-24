package javaPractice.BasicPrograms;

import java.util.Scanner;

public class NameInitials {
	
	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		String name = in.nextLine();
		
		String name = "Sourabh sahil singh";
		String words[] = name.split(" ");
		
		System.out.print("Name Initials: ");
		for(String word: words) {
			
			System.out.print(Character.toUpperCase(word.charAt(0))+".");
		}

	}
	
}


	
