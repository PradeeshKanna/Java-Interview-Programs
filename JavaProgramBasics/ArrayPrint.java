package JavaProgramBasics;

import java.util.Arrays;

// Java Program to Print an Array
public class ArrayPrint {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };

		for (int i = 0; i < array.length; i++) {
			System.out.println("Using For-Loop: " + array[i]);
		}

		for (int element : array) {
			System.out.println("Using Enhanced-Loop: " + element);
		}

		// Using Arrays class
		System.out.println(Arrays.toString(array));
	}

}
