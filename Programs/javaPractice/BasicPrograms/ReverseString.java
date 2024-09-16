package javaPractice.BasicPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		reverseString("GeeksForGeeks");
		System.out.println(reverseStringLoop("TamaT"));

	}
	
	public static void reverseString(String S) {
		
		StringBuilder sb = new StringBuilder(S);
		String reverseString = sb.reverse().toString();
		
		System.out.println(reverseString);
		
	}
	
	public static String reverseStringLoop(String s) {
		
		int strLength = s.length();
		String revString= "";
		
		for(int i=strLength-1; i>=0;--i)
		{
			revString += s.charAt(i);
		}
		return (revString);
	}

}
