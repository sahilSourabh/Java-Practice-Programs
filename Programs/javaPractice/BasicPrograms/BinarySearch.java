package javaPractice.BasicPrograms;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[] = {12,11,80,50,60,13,90};
		int key = 50;
		int flag= 0;
		
		Arrays.sort(a);
		System.out.println("Sorted Array : "+Arrays.toString(a));
		
		int l =0;
		int h = a.length-1;
		
		while(l<=h)
		{
			int m = (l+h)/2;
			
			if(a[m]==key)
			{
				flag=1;
				System.out.println("Element Found !!");
				break;
			}
			
			if(a[m] > key)
			{
				h = m-1;
			}
			
			if(a[m] < key)
			{
				l = m+1;
			}
		}
		
		if (flag==0)
		{
			System.out.println("Element Not Found !!");
		}
		
		//System.out.println(Arrays.binarySearch(a, 50));

	}

}
