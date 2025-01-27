package javaPractice.BasicPrograms;

public class PyramidPattern {

	public static void main(String[] args) {

		int rows = 5;
		
		System.out.println("Pattern 1:");
		pyramidPattern1(rows);
		
		System.out.println("Pattern 2:");
		pyramidPattern2(rows);
		
		System.out.println("Pattern 3:");
		pyramidPattern3(rows);

	}
	
	public static void pyramidPattern1(int rows) {
		
		for (int i=1; i<=rows; i++) {
			// Print spaces
			// Condition: The number of spaces in each row decreases as the row number (i) increases
			for(int j=1; j<=rows-i; j++) {
				
				System.out.print(" ");
			}
			// Print stars
			// (2*i-1) This formula generates the correct sequence of odd numbers for any given row number i.
			for(int k=1; k<=(2*i-1); k++) {
				System.out.print("*");
			}
			// Move to the next line
			System.out.println();
		}
	}
	
	public static void pyramidPattern2(int rows) {
		
		for(int i=0; i<=rows; i++) {
			
			for (int j = 1; j <= rows - i; j++) {

				System.out.print(" ");
			}
			// The number of stars equals the row number, hence (j<=i).
			for(int j=1; j<=i; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pyramidPattern3(int rows) {
		
		for(int i=0; i<=rows; i++) {
			
			// The number of stars equals the row number, hence (j<=i).
			for(int j=1; j<=i; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
