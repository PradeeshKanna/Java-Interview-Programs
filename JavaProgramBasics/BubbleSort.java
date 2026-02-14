package JavaProgramBasics;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 1, 77, 53, 8 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

// Output: 1 2 4 8 53 77 
