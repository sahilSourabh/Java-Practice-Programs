package javaPractice.BasicPrograms;

import java.util.Arrays;

public class Searching {

	public static void main(String[] args) {
		
		int arr[] = {1, 22, 3, 4, 55};
		System.out.println("Array: "+Arrays.toString(arr));
		int key = 55;
		System.out.println("Key: "+key);
		
		int result = linearSearch(arr,key);
		System.out.println("Element found at: "+result);
		
		linearSearching();

	}
	
	public static int linearSearch(int arr[], int key) {
		
		int n = arr.length;
		
		for(int i=0; i<n ; i++) {
			
			if(arr[i]==key) {
				return i;
			}
		} 
		return -1;
		
	}
	
	public static void linearSearching() {
		
		int arr[] = {1, 22, 3, 4, 55};
		System.out.println("Array: "+Arrays.toString(arr));
		
		int key = 50, flag=0;
		System.out.println("Key: "+key);
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==key) {
				
				index=i;
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("Element Not Found");
		}
		else {
			System.out.println("Element Found at: "+index);
		}
		
	}

}
