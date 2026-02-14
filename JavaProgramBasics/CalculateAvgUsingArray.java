package JavaProgramBasics;

public class CalculateAvgUsingArray {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;

		for (int n : input) {
			sum = sum + n;
		}

		System.out.println("Sum is: " + sum);

		double avg = sum / input.length;
		System.out.println("Avg is: " + avg);
	}
}
