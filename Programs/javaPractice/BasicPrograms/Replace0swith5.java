package javaPractice.BasicPrograms;

public class Replace0swith5 {

	public static void main(String[] args) {
		
		int n = 10050;
		System.out.println("Original Number: "+n);
		int num = replaceNum(n);
		
		System.out.println("Replaced Number: "+num);

	}

	public static int replaceNum(int n) {
		
		int num = n;
		int position = 1;
		
		while(n>0)
		{
			int digit = n%10;
			if(digit==0)
			{
				num = num + position*5;
			}
			position = position*10;
			n = n/10;
		}
		return num;
	}
}
