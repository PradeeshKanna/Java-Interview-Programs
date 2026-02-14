package JavaProgramBasics;

// Display even numbers from 1 to 10
public class DisplayEvenNumbers {
	public static void main(String[] args) {
		int number = 10;

		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.println(i); 	// Output:2 4 6 8 10
			}
		}
	}
}
