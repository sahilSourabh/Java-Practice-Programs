package javaPractice.BasicPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class CompressedString {

	public static void main(String[] args) {

		compressedString("aaaabbbbbccc");
		compressedString("aaaabbbbcccccddeee");
		compressedString("sssjjjjkkkooo");

	}
	
	public static void compressedString(String str) {

		System.out.println("String: " + str);

		String[] s1 = str.split("");

		LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(s1));

		String[] newStr = new String[set.size()];
		newStr = set.toArray(newStr);

		String result = "";

		for (int i = 0; i < newStr.length; i++) {
			int count = 0;

			for (int j = 0; j < s1.length; j++) {
				
				if (newStr[i].equals(s1[j])) {
					count++;
				}
			}
			result = result + newStr[i] + count;
		}
		System.out.println("Compressed String: " + result);
	}

}
