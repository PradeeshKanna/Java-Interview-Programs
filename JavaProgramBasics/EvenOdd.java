package JavaProgramBasics;

public class EvenOdd {

	public static void main(String[] args) {
		int num = 9;

		// Using If Loop
		if (num % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}

		// Using Ternary Operator
		String result = (num % 2 == 0) ? "Even" : "Odd";
		System.out.println("Number is " + result);
	}

}
