package JavaProgramDuplicate;

public class RemoveDuplicateFromIntegerArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 5, 6 };

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false; 	// Flag to check for duplicates

			// Check if arr[i] has appeared earlier in the array
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true; 	// It's a duplicate
					break; 					// No need to check further if it's already a duplicate
				}
			}

			// If it's not a duplicate, print the element
			if (!isDuplicate) {
				System.out.print(arr[i] + " ");
			}
		}
}}
