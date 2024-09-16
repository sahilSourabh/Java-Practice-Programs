package javaPractice.BasicPrograms;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		//Method-1
		binarySearching();
		
		//Method-2
		int arr[] = {10,20,30,40,50};  
        int key = 80;  
        System.out.println("Sorted Array : "+Arrays.toString(arr)+"\n"+"Key: "+key);
        
        int last=arr.length-1;  
        binarySearch(arr,0,last,key);
        
	}
	
	public static void binarySearching() {
		
		int a[] = {12,11,80,50,60,13,90};
		int key = 60;
		int flag= 0;
		
		Arrays.sort(a);
		System.out.println("Sorted Array : "+Arrays.toString(a)+"\n"+"Key: "+key);
		
		int low = 0;
		int high = a.length-1;
		
		while(low <= high)
		{
			int m = (low+high)/2;
			
			if(a[m]==key)
			{
				flag=1;
				System.out.println("Element is found at index: " + m);
				break;
			}
			
			if(a[m] > key)
			{
				high = m-1;
			}
			
			if(a[m] < key)
			{
				low = m+1;
			}
		}
		
		if (flag==0)
		{
			System.out.println("Element Not Found!");
		}
		
		//System.out.println(Arrays.binarySearch(a, 50));

	}
		
			
	public static void binarySearch(int arr[], int first, int last, int key) {

		//int mid = (first + last)/2;

		while (first <= last) {

			int mid = (first + last)/2;
			
			if (arr[mid] < key) {
				first = mid + 1;
			}
			else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} 
			else {
				last = mid - 1;
			}
			//mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

}
