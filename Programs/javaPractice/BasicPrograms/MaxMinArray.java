package javaPractice.BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxMinArray {

	public static void main(String[] args) {

		maxMinArrays();
		maxMinArray();
		System.out.println(getMinMax());
	}
	
	public static void maxMinArrays() {
		
		int[] arr = { 11, 33, 5, 55, 10, 8 };
		int n = arr.length;
		
		Arrays.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));

		System.out.println("Minimum: " + arr[0]);
		System.out.println("Maximum: " + arr[n-1]);
		System.out.println();
		
	}

	public static void maxMinArray() {

		int[] arr = {11, 33, 5, 55, 10, 8};
		int max = 0, min = arr[0];

		for (int i=0; i<arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Min: " + min+"\t"+"Max: " + max);
		System.out.println();
	}

	static List<Integer> getMinMax() {
		
		long[] a = { 11, 33, 5, 55, 10, 8 };
		int n = a.length;
		long min = a[0];

		for (int i = 1; i < n; i++) 
		{
			min = Math.min(min, a[i]);
		}

		long max = a[0];
		for (int i = 1; i < n; i++) 
		{
			max = Math.max(max, a[i]);
		}

		List<Integer> list = new ArrayList<>();
		list.add((int) min);
		list.add((int) max);

		return list;

	}
}
