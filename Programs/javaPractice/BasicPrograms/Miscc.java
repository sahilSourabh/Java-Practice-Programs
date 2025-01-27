package javaPractice.BasicPrograms;

import java.util.Arrays;

public class Miscc {

	public static void main(String[] args) {
		
		int arr[] = {5,10,2, 3,20};
		int n = arr.length;
		
		for (int i=0; i<n-1; i++) {
			
			int flag = 0;
			
			for(int j=0; j<n-1; j++ ) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		System.out.println("Sorted Array: "+ Arrays.toString(arr));		
	}
}
