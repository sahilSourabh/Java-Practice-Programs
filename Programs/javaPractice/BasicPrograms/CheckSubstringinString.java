package javaPractice.BasicPrograms;

public class CheckSubstringinString {

	public static void main(String[] args) {

		String s= "Rahul Shetty Academy";
		String sub = "Shetty";
		
		System.out.println(isSubstring(s,sub));
		System.out.println(isSubstring1(s,sub));
		System.out.println(isSubstring2(s,sub));
	}

	public static boolean isSubstring(String s, String sub) {

		return s.matches("(.*)" + sub + "(.*)");
	}

	public static boolean isSubstring1(String s, String sub) {

		return s.contains(sub);
	}

	public static boolean isSubstring2(String s, String sub) {

		return s.indexOf(sub)!=-1;
	}

}
