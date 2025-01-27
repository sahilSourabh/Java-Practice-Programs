package javaPractice.BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FindingDuplicates {

	public static void main(String[] args) {

		int arr[] = { 11, 2, 4, 5, 2, 11, 10 };
		int n = arr.length;

		System.out.println(Arrays.toString(arr));
		System.out.println(findingDuplicates(arr, n));

	}

	public static List<Integer> findingDuplicates(int arr[], int n) {

		List<Integer> list = new ArrayList<>();

		TreeMap<Integer, Integer> map = new TreeMap<>();

		for (int i : arr) {

			if (!map.containsKey(i)) {

				map.put(i, 1);
			} 
			else {
				map.put(i, map.get(i) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> e : map.entrySet()) {

			if (e.getValue() > 1) {

				list.add(e.getKey());
			}
		}

		if (list.size() == 0) {

			list.add(-1);
			return list;
		} 
		else {
			return list;
		}
	}

}
