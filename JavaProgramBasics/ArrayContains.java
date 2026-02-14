package JavaProgramBasics;

// Java Program to Check if An Array Contains a Given Value
public class ArrayContains {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int findNumber = 4;
		boolean numberFound = false;

		for (int num : numbers) {
			if (num == findNumber) {
				numberFound = true;
				break;
			}
		}

		if (numberFound) {
			System.out.println("Number present ");
		} else {
			System.out.println("Number not present ");
		}
	}

}
