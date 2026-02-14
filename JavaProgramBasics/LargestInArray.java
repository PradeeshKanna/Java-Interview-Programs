package JavaProgramBasics;

//Java Program to Find Largest Element of an Array
public class LargestInArray {

	public static void main(String[] args) {
		int[] input = { 1, 2, 4, 6, 322, 5, 77 };
		int max = input[0];

		for (int num : input) {
			if (num > max) {
				max = num;
			}
		}

		System.out.println("largest :" + max);
	}

}
