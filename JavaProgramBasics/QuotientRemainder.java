package JavaProgramBasics;

public class QuotientRemainder {
	
	public static void main(String[] args) {
		int dividend=25, divisor=4;
		
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		
		System.out.println("Quo :"+quotient);	// Output: 6
		System.out.println("Rem :"+remainder);	// Reminder: 1
	}

}
