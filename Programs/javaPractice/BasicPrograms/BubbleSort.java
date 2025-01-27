package javaPractice.BasicPrograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
		
		bubbleSort(arr,n);
		bubbleSortOptimized(arr, n);
		
		System.out.println("Sorted optimized array: ");
		printArray(arr, n);

	}

	// An optimized version of Bubble Sort
	static void bubbleSortOptimized(int arr[], int n) {
		
		int i, j, temp;
		boolean swapped = false;
		
		for (i=0; i<n-1; i++) {
			
			for (j=0; j<n-i-1; j++) {
				
				if (arr[j] > arr[j + 1]) {

					// Swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// If no two elements were swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}
	
	public static void bubbleSort(int[] a, int n) {
		
		System.out.println("Array Before Sorting: "+Arrays.toString(a));
		
		for (int i=0; i<n-1; i++) {				// Number of Passes
			
			for (int j=0; j<n-1; j++) {			// Iterations in each pass
				
				if (a[j] > a[j+1]) {
					
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}

		}
		System.out.println("Array After Sorting: "+Arrays.toString(a));
	}

	// Function to print an array
	static void printArray(int arr[], int size) {
		
		for (int i=0; i<size; i++)
		{
			System.out.print(arr[i] + " ");
		}
			
		System.out.println();
	}

}
