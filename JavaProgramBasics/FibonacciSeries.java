package JavaProgramBasics;

//Java program to Display Fibonacci Series Using for Loop
public class FibonacciSeries {
	public static void main(String[] args) {
		int totalTerm = 5;
		int a = 0;
		int b = 1;
		for (int i = 1; i <= totalTerm; i++) {
			System.out.print(a + " ");
			int sum = a + b;
			a = b;
			b = sum;
		}
	}
}

// Output: 0 1 1 2 3 