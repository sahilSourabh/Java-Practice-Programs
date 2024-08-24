package javaPractice.BasicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondLargestHashMap {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int length = in.nextInt();
		System.out.println("Length: "+length);
		HashMap <Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<length;i++) {
			
			int key = in.nextInt();
			int value = in.nextInt();
			map.put(key, value);
			
		}
		
		System.out.println("Existing hashmap: ");
		for (Map.Entry<Integer, Integer> e: map.entrySet()) {
			
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		int largest=0;
		int secondLargest=0;
		
		for(int value :map.values()) {
			
			if(value > largest) {
				
				secondLargest = largest;
				largest = value;
				
				}
			else if (value > secondLargest && value < largest) {
				
				secondLargest = value;
			}
		}
		
		System.out.println("Second largest value of the hashmap: "+secondLargest);
		

	}

}


