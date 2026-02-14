package JavaProgramBasics;

// Java Program to Count Number of Digits in an Integer
public class CountNumber {
	public static void main(String[] args) {
		int num = 875678;
		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;
		}

		System.out.println("Total Digit :" + count);  // Output: 6
	}

}
