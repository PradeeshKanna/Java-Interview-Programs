package JavaProgramBasics;

public class SumNaturalNumber {
	public static void main(String[] args) {

		int number = 5;
		int sum = 0;

		// Using for loop -> 1st way
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		System.out.println("Sum: " + sum); 		// Output: 5

		// Using while -> 2nd way
		int j = 1, newSum = 0;
		while (j <= number) {
			newSum = newSum + j;
			j++;
		}
		System.out.println("Sum: " + newSum); 	// Output: 5
	}
}
